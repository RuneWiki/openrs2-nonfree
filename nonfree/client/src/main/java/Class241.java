import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nea")
public final class Class241 implements Interface20 {

	@OriginalMember(owner = "client!nea", name = "f", descriptor = "Lclient!jo;")
	private Class187 aClass187_47 = new Class187(128);

	@OriginalMember(owner = "client!nea", name = "l", descriptor = "[I")
	private final int[] anIntArray525 = new int[Static195.aClass76_1.anInt2260];

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "[I")
	public final int[] anIntArray524 = new int[Static195.aClass76_1.anInt2260];

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(II)I")
	@Override
	public int method5814(@OriginalArg(0) int arg0) {
		return this.anIntArray524[arg0];
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BII)V")
	public void method5815(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class231 local13 = Static427.aClass225_1.method5332(arg0);
		@Pc(16) int local16 = local13.anInt6766;
		@Pc(19) int local19 = local13.anInt6768;
		@Pc(22) int local22 = local13.anInt6769;
		@Pc(29) int local29 = Class14_Sub5_Sub2.anIntArray370[local22 - local19];
		if (arg1 < 0 || arg1 > local29) {
			arg1 = 0;
		}
		local29 <<= local19;
		this.method5816(local16, local29 & arg1 << local19 | ~local29 & this.anIntArray525[local16]);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IB)I")
	@Override
	public int method5813(@OriginalArg(0) int arg0) {
		@Pc(8) Class231 local8 = Static427.aClass225_1.method5332(arg0);
		@Pc(11) int local11 = local8.anInt6766;
		@Pc(14) int local14 = local8.anInt6768;
		@Pc(17) int local17 = local8.anInt6769;
		@Pc(24) int local24 = Class14_Sub5_Sub2.anIntArray370[local17 - local14];
		return local24 & this.anIntArray524[local11] >> local14;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)V")
	public void method5816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray525[arg0] = arg1;
		@Pc(21) Class14_Sub10 local21 = (Class14_Sub10) this.aClass187_47.method4078((long) arg0);
		if (local21 == null) {
			local21 = new Class14_Sub10(4611686018427387905L);
			this.aClass187_47.method4077((long) arg0, local21);
		} else if (local21.aLong41 != 4611686018427387905L) {
			local21.aLong41 = Static521.method7499() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)V")
	public void method5818() {
		for (@Pc(13) int local13 = 0; local13 < Static195.aClass76_1.anInt2260; local13++) {
			@Pc(20) Class365 local20 = Static195.aClass76_1.method1917(local13);
			if (local20 != null && local20.anInt10573 == 0) {
				this.anIntArray525[local13] = 0;
				this.anIntArray524[local13] = 0;
			}
		}
		this.aClass187_47 = new Class187(128);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IZI)V")
	public void method5819(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class231 local8 = Static427.aClass225_1.method5332(arg1);
		@Pc(11) int local11 = local8.anInt6766;
		@Pc(14) int local14 = local8.anInt6768;
		@Pc(17) int local17 = local8.anInt6769;
		@Pc(24) int local24 = Class14_Sub5_Sub2.anIntArray370[local17 - local14];
		if (arg0 < 0 || local24 < arg0) {
			arg0 = 0;
		}
		local24 <<= local14;
		this.method5821(this.anIntArray524[local11] & ~local24 | arg0 << local14 & local24, local11);
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(BII)V")
	public void method5821(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray524[arg1] = arg0;
		@Pc(24) Class14_Sub10 local24 = (Class14_Sub10) this.aClass187_47.method4078((long) arg1);
		if (local24 == null) {
			local24 = new Class14_Sub10(Static521.method7499() + 500L);
			this.aClass187_47.method4077((long) arg1, local24);
		} else {
			local24.aLong41 = Static521.method7499() + 500L;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ZI)I")
	public int method5823(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static521.method7499();
		for (@Pc(22) Class14_Sub10 local22 = arg0 ? (Class14_Sub10) this.aClass187_47.method4079() : (Class14_Sub10) this.aClass187_47.method4084(); local22 != null; local22 = (Class14_Sub10) this.aClass187_47.method4084()) {
			if (local8 > (local22.aLong41 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local22.aLong41 & 0x4000000000000000L) != 0L) {
					@Pc(48) int local48 = (int) local22.aLong305;
					this.anIntArray524[local48] = this.anIntArray525[local48];
					local22.method9315();
					return local48;
				}
				local22.method9315();
			}
		}
		return -1;
	}
}
