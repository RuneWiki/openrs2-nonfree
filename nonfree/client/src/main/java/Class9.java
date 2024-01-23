import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class9 implements Interface3 {

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
	private int anInt178 = 50;

	@OriginalMember(owner = "client!ah", name = "F", descriptor = "Z")
	private boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "Lclient!mb;")
	private Class70 aClass70_3;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "Lclient!mb;")
	private Class70 aClass70_2;

	@OriginalMember(owner = "client!ah", name = "E", descriptor = "Lclient!w;")
	private Class123 aClass123_1;

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "[Z")
	private boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!ah", name = "B", descriptor = "[Z")
	private boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "[Z")
	private boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "[Z")
	private boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!ah", name = "z", descriptor = "[Z")
	private boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!ah", name = "v", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!mb;Lclient!mb;Lclient!mb;IZ)V")
	public Class9(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass70_3 = arg2;
		this.anInt178 = arg3;
		this.aBoolean7 = arg4;
		this.aClass70_2 = arg0;
		this.aClass123_1 = new Class123(this.anInt178);
		@Pc(37) Class1_Sub16 local37 = new Class1_Sub16(arg1.method3509(0, 0));
		@Pc(41) int local41 = local37.method3805();
		this.aShortArray1 = new short[local41];
		this.aByteArray1 = new byte[local41];
		this.aByteArray3 = new byte[local41];
		this.aBooleanArray4 = new boolean[local41];
		this.aBooleanArray6 = new boolean[local41];
		this.aByteArray2 = new byte[local41];
		this.aBooleanArray3 = new boolean[local41];
		this.aBooleanArray2 = new boolean[local41];
		this.aBooleanArray5 = new boolean[local41];
		this.aByteArray4 = new byte[local41];
		for (@Pc(83) int local83 = 0; local83 < local41; local83++) {
			this.aBooleanArray3[local83] = local37.method3793() == 1;
		}
		for (@Pc(103) int local103 = 0; local103 < local41; local103++) {
			if (this.aBooleanArray3[local103]) {
				this.aBooleanArray5[local103] = local37.method3793() == 1;
			}
		}
		for (@Pc(128) int local128 = 0; local128 < local41; local128++) {
			if (this.aBooleanArray3[local128]) {
				this.aBooleanArray2[local128] = local37.method3793() == 1;
			}
		}
		for (@Pc(157) int local157 = 0; local157 < local41; local157++) {
			if (this.aBooleanArray3[local157]) {
				this.aBooleanArray6[local157] = local37.method3793() == 1;
			}
		}
		for (@Pc(188) int local188 = 0; local188 < local41; local188++) {
			if (this.aBooleanArray3[local188]) {
				this.aBooleanArray4[local188] = local37.method3793() == 1;
			}
		}
		for (@Pc(215) int local215 = 0; local215 < local41; local215++) {
			if (this.aBooleanArray3[local215]) {
				this.aByteArray1[local215] = local37.method3802();
			}
		}
		for (@Pc(239) int local239 = 0; local239 < local41; local239++) {
			if (this.aBooleanArray3[local239]) {
				this.aByteArray2[local239] = local37.method3802();
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local41; local259++) {
			if (this.aBooleanArray3[local259]) {
				this.aByteArray4[local259] = local37.method3802();
			}
		}
		for (@Pc(283) int local283 = 0; local283 < local41; local283++) {
			if (this.aBooleanArray3[local283]) {
				this.aByteArray3[local283] = local37.method3802();
			}
		}
		for (@Pc(307) int local307 = 0; local307 < local41; local307++) {
			if (this.aBooleanArray3[local307]) {
				this.aShortArray1[local307] = (short) local37.method3805();
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method124(@OriginalArg(0) int arg0) {
		return this.aBoolean7 || this.aBooleanArray6[arg0];
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(IZ)[I")
	@Override
	public int[] method126(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub2_Sub4 local4 = this.method129(arg0);
		return local4 == null ? null : local4.method675(this, this.aBoolean7 || this.aBooleanArray6[arg0], this.aClass70_3);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IFB)[I")
	@Override
	public int[] method122(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(16) Class1_Sub2_Sub4 local16 = this.method129(arg0);
		if (local16 == null) {
			return null;
		} else {
			local16.aBoolean46 = true;
			return local16.method671(this.aClass70_3, this.aBoolean7 || this.aBooleanArray6[arg0], this, arg1);
		}
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(II)Lclient!dd;")
	private Class1_Sub2_Sub4 method129(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub2_Sub4 local11 = (Class1_Sub2_Sub4) this.aClass123_1.method3640((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(22) byte[] local22 = this.aClass70_2.method3509(0, arg0);
		if (local22 == null) {
			return null;
		} else {
			@Pc(36) Class1_Sub16 local36 = new Class1_Sub16(local22);
			local11 = new Class1_Sub2_Sub4(local36);
			this.aClass123_1.method3644(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method125(@OriginalArg(0) int arg0) {
		return this.aBooleanArray2[arg0];
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method123(@OriginalArg(1) int arg0) {
		return this.aBooleanArray5[arg0];
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)I")
	@Override
	public int method128(@OriginalArg(0) int arg0) {
		return this.aShortArray1[arg0] & 0xFFFF;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(IZ)Z")
	@Override
	public boolean method127(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub2_Sub4 local15 = this.method129(arg0);
		return local15 == null ? false : local15.method673(this.aClass70_3, this);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	public void method133() {
		this.aClass123_1.method3639();
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(IZ)V")
	public void method134(@OriginalArg(1) boolean arg0) {
		this.aBoolean7 = arg0;
		this.method133();
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(II)V")
	public void method136(@OriginalArg(0) int arg0) {
		for (@Pc(13) Class1_Sub2_Sub4 local13 = (Class1_Sub2_Sub4) this.aClass123_1.method3641(); local13 != null; local13 = (Class1_Sub2_Sub4) this.aClass123_1.method3638()) {
			if (local13.aBoolean46) {
				local13.method670(arg0);
				local13.aBoolean46 = false;
			}
		}
	}
}
