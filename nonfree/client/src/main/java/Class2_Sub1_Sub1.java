import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public abstract class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aaa", name = "X", descriptor = "S")
	public short aShort121;

	@OriginalMember(owner = "client!aaa", name = "T", descriptor = "S")
	public short aShort119;

	@OriginalMember(owner = "client!aaa", name = "K", descriptor = "S")
	public short aShort118;

	@OriginalMember(owner = "client!aaa", name = "Y", descriptor = "B")
	public final byte aByte142;

	@OriginalMember(owner = "client!aaa", name = "U", descriptor = "S")
	public short aShort120;

	@OriginalMember(owner = "client!aaa", name = "O", descriptor = "Z")
	public final boolean aBoolean703;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class2_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aShort121 = (short) arg7;
		super.aByte141 = (byte) arg1;
		this.aShort119 = (short) arg6;
		this.aShort118 = (short) arg5;
		super.aByte140 = (byte) arg0;
		this.aByte142 = arg10;
		this.aShort120 = (short) arg8;
		super.anInt10004 = arg3;
		super.anInt10006 = arg2;
		this.aBoolean703 = arg9;
		super.anInt10001 = arg4;
	}

	@OriginalMember(owner = "client!aaa", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8461() {
		for (@Pc(8) int local8 = this.aShort118; local8 <= this.aShort119; local8++) {
			for (@Pc(16) int local16 = this.aShort121; local16 <= this.aShort120; local16++) {
				@Pc(24) int local24 = local8 + Static514.anInt8546 - Static608.anInt9872;
				if (local24 >= 0 && local24 < Static443.aBooleanArrayArray8.length) {
					@Pc(42) int local42 = Static514.anInt8546 + local16 - Static370.anInt6309;
					if (local42 >= 0 && local42 < Static443.aBooleanArrayArray8.length && Static443.aBooleanArrayArray8[local24][local42]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "(Z)V")
	public void method8465() {
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z[Lclient!sca;)I")
	@Override
	public final int method8450(@OriginalArg(1) Class6_Sub17[] arg0) {
		@Pc(12) int local12 = 0;
		@Pc(20) int local20;
		@Pc(43) int local43;
		@Pc(58) int local58;
		label113: for (@Pc(15) int local15 = this.aShort118; local15 <= this.aShort119; local15++) {
			label111: for (local20 = this.aShort121; local20 <= this.aShort120; local20++) {
				@Pc(31) long local31 = Static371.aLongArrayArrayArray1[super.aByte140][local15][local20];
				@Pc(33) long local33 = 0L;
				while (true) {
					label106: while (true) {
						if (local33 > 48L) {
							continue label111;
						}
						local43 = (int) (local31 >>> (int) local33 & 0xFFFFL);
						if (local43 <= 0) {
							continue label111;
						}
						@Pc(56) Class394 local56 = Static193.aClass394Array1[local43 - 1];
						for (local58 = 0; local58 < local12; local58++) {
							if (local56.aClass6_Sub17_3 == arg0[local58]) {
								local33 += 16L;
								continue label106;
							}
						}
						arg0[local12++] = local56.aClass6_Sub17_3;
						if (local12 == 4) {
							break label113;
						}
						local33 += 16L;
					}
				}
			}
		}
		for (local20 = local12; local20 < 4; local20++) {
			arg0[local20] = null;
		}
		if (this.aByte142 != 0) {
			local43 = this.aShort118 - Static608.anInt9872;
			@Pc(145) int local145 = this.aShort121 - Static370.anInt6309;
			@Pc(168) int local168;
			@Pc(171) short local171;
			@Pc(158) short local158;
			@Pc(163) int local163;
			if (this.aByte142 == 1) {
				if (local43 >= local145) {
					local158 = this.aShort118;
					local171 = this.aShort121;
					local163 = this.aShort118 - 1;
					local168 = this.aShort121 + 1;
				} else {
					local158 = this.aShort118;
					local163 = this.aShort118 + 1;
					local171 = this.aShort121;
					local168 = this.aShort121 - 1;
				}
			} else if (local145 > -local43) {
				local158 = this.aShort118;
				local163 = this.aShort118 - 1;
				local168 = this.aShort121 - 1;
				local171 = this.aShort121;
			} else {
				local158 = this.aShort118;
				local168 = this.aShort121 + 1;
				local171 = this.aShort121;
				local163 = this.aShort118 + 1;
			}
			label77: for (local58 = 0; local58 < local12; local58++) {
				@Pc(241) long local241 = Static371.aLongArrayArrayArray1[super.aByte140][local158][local168];
				@Pc(252) Class394 local252;
				while (local241 != 0L) {
					local252 = Static193.aClass394Array1[(int) ((local241 & 0xFFFFL) - 1L)];
					local241 >>>= 0x10;
					if (local252.aClass6_Sub17_3 == arg0[local58]) {
						continue label77;
					}
				}
				local241 = Static371.aLongArrayArrayArray1[super.aByte140][local163][local171];
				while (local241 != 0L) {
					local252 = Static193.aClass394Array1[(int) ((local241 & 0xFFFFL) - 1L)];
					local241 >>>= 0x10;
					if (arg0[local58] == local252.aClass6_Sub17_3) {
						continue label77;
					}
				}
				for (@Pc(310) int local310 = local58; local310 < local12 - 1; local310++) {
					arg0[local310] = arg0[local310 + 1];
				}
				local12--;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8445(@OriginalArg(0) Class132 arg0) {
		return Static135.method2049(this.method8459(arg0), this.aShort120, super.aByte141, this.aShort121, this.aShort118, this.aShort119);
	}
}
