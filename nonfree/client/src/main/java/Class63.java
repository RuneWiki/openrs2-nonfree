import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class63 {

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Lclient!tl;")
	private final Class227 aClass227_11 = new Class227(16);

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Lclient!ui;")
	private final Class230 aClass230_27;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;)V")
	public Class63(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2) {
		this.aClass230_27 = arg2;
		this.aClass230_27.method4956(29);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILclient!bp;IBI)Lclient!bt;")
	public Class33 method1190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) Class240[] local15 = null;
		@Pc(22) Class191 local22 = this.method1193(arg1);
		if (local22.anIntArray595 != null) {
			local15 = new Class240[local22.anIntArray595.length];
			for (@Pc(32) int local32 = 0; local32 < local15.length; local32++) {
				@Pc(42) Class244 local42 = arg2.method523(local22.anIntArray595[local32]);
				local15[local32] = new Class240(local42.anInt6206, local42.anInt6196, local42.anInt6211, local42.anInt6201, local42.anInt6203, local42.anInt6208, local42.anInt6209, local42.aBoolean574);
			}
		}
		return new Class33(local22.anInt4939, local15, local22.anInt4936, arg4, arg0, arg3);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
	public void method1191() {
		@Pc(2) Class227 local2 = this.aClass227_11;
		synchronized (this.aClass227_11) {
			this.aClass227_11.method4871();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public void method1192() {
		@Pc(2) Class227 local2 = this.aClass227_11;
		synchronized (this.aClass227_11) {
			this.aClass227_11.method4858();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Lclient!qj;")
	private Class191 method1193(@OriginalArg(0) int arg0) {
		@Pc(6) Class227 local6 = this.aClass227_11;
		@Pc(23) Class191 local23;
		synchronized (this.aClass227_11) {
			local23 = (Class191) this.aClass227_11.method4863((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(40) byte[] local40 = this.aClass230_27.method4985(arg0, 29);
		local23 = new Class191();
		if (local40 != null) {
			local23.method4352(new Class1_Sub33(local40));
		}
		@Pc(56) Class227 local56 = this.aClass227_11;
		synchronized (this.aClass227_11) {
			this.aClass227_11.method4865(local23, (long) arg0);
			return local23;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)V")
	public void method1194() {
		@Pc(17) Class227 local17 = this.aClass227_11;
		synchronized (this.aClass227_11) {
			this.aClass227_11.method4859(5);
		}
	}
}
