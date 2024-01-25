import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class67_Sub3_Sub4 extends Class67_Sub3 {

	@OriginalMember(owner = "client!te", name = "V", descriptor = "Lclient!e;")
	private Class10_Sub2 aClass10_Sub2_7;

	@OriginalMember(owner = "client!te", name = "M", descriptor = "I")
	private int anInt5956 = 0;

	@OriginalMember(owner = "client!te", name = "X", descriptor = "I")
	private int anInt5965 = 0;

	@OriginalMember(owner = "client!te", name = "bb", descriptor = "I")
	private int anInt5968 = -32768;

	@OriginalMember(owner = "client!te", name = "K", descriptor = "Z")
	public boolean aBoolean398 = false;

	@OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
	private final int anInt5960 = -1;

	@OriginalMember(owner = "client!te", name = "L", descriptor = "I")
	private final int anInt5955;

	@OriginalMember(owner = "client!te", name = "W", descriptor = "I")
	public final int anInt5964;

	@OriginalMember(owner = "client!te", name = "T", descriptor = "Lclient!jm;")
	private Class111 aClass111_3;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class67_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt5955 = arg0;
		this.anInt5964 = arg2 + arg1;
		@Pc(41) int local41 = Static89.method1296(this.anInt5955).anInt6649;
		if (local41 == -1) {
			this.aBoolean398 = true;
		} else {
			this.aBoolean398 = false;
			this.aClass111_3 = Static306.method5143(local41);
		}
		if (this.anInt5964 == arg2) {
			Static354.method5681(super.anInt6310, super.anInt6308, this.aClass111_3, false, this.anInt5956);
		}
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(B)I")
	@Override
	public int method5408() {
		return this.anInt5968;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
	public void method5131() {
		if (this.aClass10_Sub2_7 != null) {
			this.aClass10_Sub2_7.method989();
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(B)V")
	@Override
	public void method5403() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!te", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass10_Sub2_7 != null) {
			this.aClass10_Sub2_7.method989();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZLclient!uo;)Lclient!aj;")
	@Override
	public Class10_Sub1 method5401(@OriginalArg(1) Class129 arg0) {
		@Pc(14) Class126 local14 = this.method5132(1024, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class61 local21 = arg0.method4979();
		local21.method3666(super.anInt6308, super.anInt6313, super.anInt6310);
		if (this.aClass10_Sub2_7 == null) {
			local14.method3139(local21, null, 0);
		} else {
			@Pc(43) Class136 local43 = this.aClass10_Sub2_7.method981();
			arg0.method4977(local14, local43, local21, null);
		}
		this.anInt5968 = local14.method3155();
		this.method5134(arg0, local14);
		return null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!uo;I)Lclient!mj;")
	private Class126 method5132(@OriginalArg(0) int arg0, @OriginalArg(1) Class129 arg1) {
		@Pc(8) Class213 local8 = Static89.method1296(this.anInt5955);
		return this.aBoolean398 ? local8.method5646(-1, arg1, arg0, -1, 0) : local8.method5646(this.anInt5956, arg1, arg0, this.anInt5960, this.anInt5965);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILclient!uo;I)Z")
	@Override
	public boolean method5400(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5395(@OriginalArg(0) Class129 arg0) {
		@Pc(13) Class126 local13 = this.method5132(0, arg0);
		if (local13 != null) {
			this.method5134(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5399() {
		return false;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)V")
	public void method5133(@OriginalArg(1) int arg0) {
		if (this.aBoolean398) {
			return;
		}
		this.anInt5965 += arg0;
		while (this.aClass111_3.anIntArray190[this.anInt5956] < this.anInt5965) {
			this.anInt5965 -= this.aClass111_3.anIntArray190[this.anInt5956];
			this.anInt5956++;
			if (this.anInt5956 >= this.aClass111_3.anIntArray191.length) {
				this.aBoolean398 = true;
				break;
			}
		}
		if (!this.aBoolean398) {
			Static354.method5681(super.anInt6310, super.anInt6308, this.aClass111_3, false, this.anInt5956);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBIILclient!rr;Lclient!uo;Z)V")
	@Override
	public void method5398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class67 arg3, @OriginalArg(5) Class129 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!uo;BLclient!mj;)V")
	private void method5134(@OriginalArg(0) Class129 arg0, @OriginalArg(2) Class126 arg1) {
		@Pc(6) Class174[] local6 = arg1.method3151();
		@Pc(16) Class212[] local16 = arg1.method3141();
		if ((this.aClass10_Sub2_7 == null || this.aClass10_Sub2_7.aBoolean75) && (local6 != null || local16 != null)) {
			this.aClass10_Sub2_7 = new Class10_Sub2(Static293.anInt5807);
		}
		if (this.aClass10_Sub2_7 != null) {
			this.aClass10_Sub2_7.method990(arg0, (long) Static293.anInt5807, local6, local16);
			this.aClass10_Sub2_7.method979(super.aByte73, super.aShort91, super.aShort93, super.aShort90, super.aShort92);
		}
	}
}
