import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class225 {

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "Lclient!mo;")
	private final Class160 aClass160_53 = new Class160(16);

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "Lclient!nl;")
	private final Class171 aClass171_87;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;)V")
	public Class225(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_87 = arg2;
		this.aClass171_87.method3750(29);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	public void method4899() {
		@Pc(2) Class160 local2 = this.aClass160_53;
		synchronized (this.aClass160_53) {
			this.aClass160_53.method3595();
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)V")
	public void method4900() {
		@Pc(2) Class160 local2 = this.aClass160_53;
		synchronized (this.aClass160_53) {
			this.aClass160_53.method3606(5);
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
	public void method4902() {
		@Pc(2) Class160 local2 = this.aClass160_53;
		synchronized (this.aClass160_53) {
			this.aClass160_53.method3605();
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Lclient!rh;")
	private Class207 method4903(@OriginalArg(1) int arg0) {
		@Pc(6) Class160 local6 = this.aClass160_53;
		@Pc(18) Class207 local18;
		synchronized (this.aClass160_53) {
			local18 = (Class207) this.aClass160_53.method3599((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(35) byte[] local35 = this.aClass171_87.method3745(29, arg0);
		local18 = new Class207();
		if (local35 != null) {
			local18.method4427(new Class2_Sub16(local35));
		}
		@Pc(51) Class160 local51 = this.aClass160_53;
		synchronized (this.aClass160_53) {
			this.aClass160_53.method3602((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIILclient!hl;)Lclient!ci;")
	public Class33 method4905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class98 arg4) {
		@Pc(13) Class126[] local13 = null;
		@Pc(18) Class207 local18 = this.method4903(arg2);
		if (local18.anIntArray1003 != null) {
			local13 = new Class126[local18.anIntArray1003.length];
			for (@Pc(28) int local28 = 0; local28 < local13.length; local28++) {
				@Pc(38) Class13 local38 = arg4.method2525(local18.anIntArray1003[local28]);
				local13[local28] = new Class126(local38.anInt372, local38.anInt378, local38.anInt373, local38.anInt375, local38.anInt374, local38.anInt376, local38.anInt371, local38.aBoolean33);
			}
		}
		return new Class33(local18.anInt5076, local13, local18.anInt5081, arg1, arg3, arg0);
	}
}
