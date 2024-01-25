import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class49 {

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_6 = new Class288(16);

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "Lclient!gp;")
	private final Class117 aClass117_31;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;)V")
	public Class49(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2) {
		this.aClass117_31 = arg2;
		this.aClass117_31.method2951(29);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
	public void method1193() {
		@Pc(6) Class288 local6 = this.aClass288_6;
		synchronized (this.aClass288_6) {
			this.aClass288_6.method6744();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
	public void method1195() {
		@Pc(8) Class288 local8 = this.aClass288_6;
		synchronized (this.aClass288_6) {
			this.aClass288_6.method6742();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!gr;BIII)Lclient!eh;")
	public Class82 method1196(@OriginalArg(0) int arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Class263[] local12 = null;
		@Pc(17) Class207 local17 = this.method1198(arg4);
		if (local17.anIntArray468 != null) {
			local12 = new Class263[local17.anIntArray468.length];
			for (@Pc(27) int local27 = 0; local27 < local12.length; local27++) {
				@Pc(37) Class69 local37 = arg1.method3007(local17.anIntArray468[local27]);
				local12[local27] = new Class263(local37.anInt2210, local37.anInt2206, local37.anInt2212, local37.anInt2207, local37.anInt2205, local37.anInt2213, local37.anInt2214, local37.aBoolean141);
			}
		}
		return new Class82(local17.anInt6282, local12, local17.anInt6279, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V")
	public void method1197() {
		@Pc(6) Class288 local6 = this.aClass288_6;
		synchronized (this.aClass288_6) {
			this.aClass288_6.method6735(5);
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)Lclient!ng;")
	private Class207 method1198(@OriginalArg(0) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_6;
		@Pc(16) Class207 local16;
		synchronized (this.aClass288_6) {
			local16 = (Class207) this.aClass288_6.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class117 local29 = this.aClass117_31;
		@Pc(38) byte[] local38;
		synchronized (this.aClass117_31) {
			local38 = this.aClass117_31.method2962(arg0, 29);
		}
		local16 = new Class207();
		if (local38 != null) {
			local16.method5214(new Class5_Sub3(local38));
		}
		@Pc(65) Class288 local65 = this.aClass288_6;
		synchronized (this.aClass288_6) {
			this.aClass288_6.method6746(local16, (long) arg0);
			return local16;
		}
	}
}
