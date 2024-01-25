import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class47 {

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "Lclient!wm;")
	private final Class267 aClass267_12 = new Class267(16);

	@OriginalMember(owner = "client!cv", name = "k", descriptor = "Lclient!ph;")
	private final Class187 aClass187_24;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;)V")
	public Class47(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2) {
		this.aClass187_24 = arg2;
		this.aClass187_24.method4306(29);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)V")
	public void method1072() {
		@Pc(2) Class267 local2 = this.aClass267_12;
		synchronized (this.aClass267_12) {
			this.aClass267_12.method6007(5);
		}
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V")
	public void method1075() {
		@Pc(2) Class267 local2 = this.aClass267_12;
		synchronized (this.aClass267_12) {
			this.aClass267_12.method6011();
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BI)Lclient!in;")
	private Class119 method1076(@OriginalArg(1) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_12;
		@Pc(16) Class119 local16;
		synchronized (this.aClass267_12) {
			local16 = (Class119) this.aClass267_12.method6014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class187 local34 = this.aClass187_24;
		@Pc(43) byte[] local43;
		synchronized (this.aClass187_24) {
			local43 = this.aClass187_24.method4300(29, arg0);
		}
		local16 = new Class119();
		if (local43 != null) {
			local16.method2945(new Class10_Sub8(local43));
		}
		@Pc(65) Class267 local65 = this.aClass267_12;
		synchronized (this.aClass267_12) {
			this.aClass267_12.method6008(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)V")
	public void method1077() {
		@Pc(10) Class267 local10 = this.aClass267_12;
		synchronized (this.aClass267_12) {
			this.aClass267_12.method6013();
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIILclient!lq;I)Lclient!sv;")
	public Class230 method1078(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class158 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class161[] local7 = null;
		@Pc(12) Class119 local12 = this.method1076(arg0);
		if (local12.anIntArray370 != null) {
			local7 = new Class161[local12.anIntArray370.length];
			for (@Pc(26) int local26 = 0; local26 < local7.length; local26++) {
				@Pc(38) Class179 local38 = arg3.method3476(local12.anIntArray370[local26]);
				local7[local26] = new Class161(local38.anInt5071, local38.anInt5069, local38.anInt5063, local38.anInt5065, local38.anInt5066, local38.anInt5068, local38.anInt5072, local38.aBoolean343);
			}
		}
		return new Class230(local12.anInt3655, local7, local12.anInt3657, arg4, arg1, arg2);
	}
}
