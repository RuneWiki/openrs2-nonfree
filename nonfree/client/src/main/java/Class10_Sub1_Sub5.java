import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class10_Sub1_Sub5 extends Class10_Sub1 {

	@OriginalMember(owner = "client!wo", name = "V", descriptor = "Lclient!kr;")
	private Class7_Sub7 aClass7_Sub7_7;

	@OriginalMember(owner = "client!wo", name = "S", descriptor = "I")
	private int anInt6745 = 0;

	@OriginalMember(owner = "client!wo", name = "I", descriptor = "I")
	private int anInt6736 = -32768;

	@OriginalMember(owner = "client!wo", name = "Y", descriptor = "I")
	private int anInt6748 = 0;

	@OriginalMember(owner = "client!wo", name = "Z", descriptor = "I")
	private final int anInt6749 = -1;

	@OriginalMember(owner = "client!wo", name = "X", descriptor = "Z")
	public boolean aBoolean554 = false;

	@OriginalMember(owner = "client!wo", name = "U", descriptor = "I")
	private final int anInt6746;

	@OriginalMember(owner = "client!wo", name = "ab", descriptor = "I")
	public final int anInt6750;

	@OriginalMember(owner = "client!wo", name = "G", descriptor = "Lclient!rj;")
	private Class177 aClass177_3;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class10_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt6746 = arg0;
		this.anInt6750 = arg1 + arg2;
		@Pc(40) int local40 = Static264.method4763(this.anInt6746).anInt4910;
		if (local40 == -1) {
			this.aBoolean554 = true;
		} else {
			this.aBoolean554 = false;
			this.aClass177_3 = Static354.method5863(local40);
		}
		if (arg2 == this.anInt6750) {
			Static351.method3417(super.anInt6726, false, super.anInt6728, this.anInt6745, this.aClass177_3);
		}
	}

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)I")
	@Override
	public int method5829() {
		return this.anInt6736;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(Lclient!ii;I)Lclient!eb;")
	@Override
	public Class7_Sub3 method5821(@OriginalArg(0) Class105 arg0) {
		@Pc(15) Class40 local15 = this.method5841(arg0, 1024);
		if (local15 == null) {
			return null;
		}
		@Pc(22) Class31 local22 = arg0.method4304();
		local22.method3187(super.anInt6728, super.anInt6722, super.anInt6726);
		if (this.aClass7_Sub7_7 == null) {
			local15.method4587(local22, null, 0);
		} else {
			@Pc(37) Class153 local37 = this.aClass7_Sub7_7.method2817();
			arg0.method4276(local15, local37, local22, null);
		}
		this.anInt6736 = local15.method4572();
		this.method5835(local15, arg0);
		return null;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BLclient!dc;Lclient!ii;)V")
	private void method5835(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class105 arg1) {
		@Pc(6) Class100[] local6 = arg0.method4606();
		@Pc(18) Class123[] local18 = arg0.method4589();
		if ((this.aClass7_Sub7_7 == null || this.aClass7_Sub7_7.aBoolean255) && (local6 != null || local18 != null)) {
			this.aClass7_Sub7_7 = new Class7_Sub7(Static282.anInt3516);
		}
		if (this.aClass7_Sub7_7 != null) {
			this.aClass7_Sub7_7.method2818(arg1, (long) Static282.anInt3516, local6, local18);
			this.aClass7_Sub7_7.method2826(super.aByte73, super.aShort94, super.aShort93, super.aShort91, super.aShort92);
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!ii;)V")
	@Override
	public void method5822(@OriginalArg(1) Class105 arg0) {
		@Pc(9) Class40 local9 = this.method5841(arg0, 0);
		if (local9 != null) {
			this.method5835(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5824() {
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass7_Sub7_7 != null) {
			this.aClass7_Sub7_7.method2822();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)V")
	@Override
	public void method5819() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIZLclient!ii;)Z")
	@Override
	public boolean method5826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class105 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(Z)V")
	public void method5838() {
		if (this.aClass7_Sub7_7 != null) {
			this.aClass7_Sub7_7.method2822();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ii;IIIILclient!nc;Z)V")
	@Override
	public void method5825(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(II)V")
	public void method5839(@OriginalArg(0) int arg0) {
		if (this.aBoolean554) {
			return;
		}
		this.anInt6748 += arg0;
		while (this.aClass177_3.anIntArray528[this.anInt6745] < this.anInt6748) {
			this.anInt6748 -= this.aClass177_3.anIntArray528[this.anInt6745];
			this.anInt6745++;
			if (this.aClass177_3.anIntArray529.length <= this.anInt6745) {
				this.aBoolean554 = true;
				break;
			}
		}
		if (!this.aBoolean554) {
			Static351.method3417(super.anInt6726, false, super.anInt6728, this.anInt6745, this.aClass177_3);
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ii;II)Lclient!dc;")
	private Class40 method5841(@OriginalArg(0) Class105 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class162 local13 = Static264.method4763(this.anInt6746);
		return this.aBoolean554 ? local13.method4328(arg1, arg0, -1, 0, -1) : local13.method4328(arg1, arg0, this.anInt6749, this.anInt6748, this.anInt6745);
	}
}
