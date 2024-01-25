import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class263 {

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "Lclient!jk;")
	private final Class137 aClass137_57 = new Class137(16);

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "Lclient!qn;")
	private final Class211 aClass211_96;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;)V")
	public Class263(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_96 = arg2;
		this.aClass211_96.method4365(29);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIILclient!iu;I)Lclient!qj;")
	public Class209 method5912(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class129 arg3, @OriginalArg(5) int arg4) {
		@Pc(13) Class243[] local13 = null;
		@Pc(18) Class227 local18 = this.method5914(arg4);
		if (local18.anIntArray467 != null) {
			local13 = new Class243[local18.anIntArray467.length];
			for (@Pc(28) int local28 = 0; local28 < local13.length; local28++) {
				@Pc(38) Class193 local38 = arg3.method2472(local18.anIntArray467[local28]);
				local13[local28] = new Class243(local38.anInt4845, local38.anInt4841, local38.anInt4850, local38.anInt4844, local38.anInt4851, local38.anInt4842, local38.anInt4843, local38.aBoolean353);
			}
		}
		return new Class209(local18.anInt5940, local13, local18.anInt5939, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(BI)Lclient!sc;")
	private Class227 method5914(@OriginalArg(1) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_57;
		@Pc(16) Class227 local16;
		synchronized (this.aClass137_57) {
			local16 = (Class227) this.aClass137_57.method2744((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_96;
		@Pc(40) byte[] local40;
		synchronized (this.aClass211_96) {
			local40 = this.aClass211_96.method4377(29, arg0);
		}
		local16 = new Class227();
		if (local40 != null) {
			local16.method4735(new Class4_Sub9(local40));
		}
		@Pc(62) Class137 local62 = this.aClass137_57;
		synchronized (this.aClass137_57) {
			this.aClass137_57.method2732((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
	public void method5915() {
		@Pc(6) Class137 local6 = this.aClass137_57;
		synchronized (this.aClass137_57) {
			this.aClass137_57.method2737();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
	public void method5917() {
		@Pc(6) Class137 local6 = this.aClass137_57;
		synchronized (this.aClass137_57) {
			this.aClass137_57.method2739();
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(BI)V")
	public void method5921() {
		@Pc(2) Class137 local2 = this.aClass137_57;
		synchronized (this.aClass137_57) {
			this.aClass137_57.method2745(5);
		}
	}
}
