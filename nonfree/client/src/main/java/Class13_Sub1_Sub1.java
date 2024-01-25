import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public abstract class Class13_Sub1_Sub1 extends Class13_Sub1 {

	@OriginalMember(owner = "client!gs", name = "M", descriptor = "Z")
	public final boolean aBoolean680;

	@OriginalMember(owner = "client!gs", name = "B", descriptor = "S")
	public short aShort117;

	@OriginalMember(owner = "client!gs", name = "R", descriptor = "S")
	public short aShort120;

	@OriginalMember(owner = "client!gs", name = "N", descriptor = "B")
	public final byte aByte118;

	@OriginalMember(owner = "client!gs", name = "I", descriptor = "S")
	public short aShort119;

	@OriginalMember(owner = "client!gs", name = "C", descriptor = "S")
	public short aShort118;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class13_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		super.anInt10089 = arg4;
		this.aBoolean680 = arg9;
		this.aShort117 = (short) arg5;
		this.aShort120 = (short) arg6;
		super.aByte127 = (byte) arg0;
		this.aByte118 = arg10;
		this.aShort119 = (short) arg7;
		super.anInt10097 = arg3;
		this.aShort118 = (short) arg8;
		super.anInt10090 = arg2;
		super.aByte126 = (byte) arg1;
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method8403() {
		for (@Pc(14) int local14 = this.aShort117; local14 <= this.aShort120; local14++) {
			for (@Pc(19) int local19 = this.aShort119; local19 <= this.aShort118; local19++) {
				@Pc(29) int local29 = local14 + Static335.anInt5343 - Static566.anInt9234;
				if (local29 >= 0 && Static494.aBooleanArrayArray8.length > local29) {
					@Pc(47) int local47 = Static335.anInt5343 + local19 - Static370.anInt5837;
					if (local47 >= 0 && local47 < Static494.aBooleanArrayArray8.length && Static494.aBooleanArrayArray8[local29][local47]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "(I)Z")
	@Override
	public final boolean method8406() {
		return Static349.method4698(this.aShort119, this.method8397(), super.aByte126, this.aShort118, this.aShort117, this.aShort120);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I[Lclient!kb;)I")
	@Override
	public final int method8401(@OriginalArg(1) Class2_Sub24[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(48) int local48;
		label112: for (@Pc(10) int local10 = this.aShort117; local10 <= this.aShort120; local10++) {
			label110: for (@Pc(15) int local15 = this.aShort119; local15 <= this.aShort118; local15++) {
				@Pc(26) long local26 = Static478.aLongArrayArrayArray4[super.aByte127][local10][local15];
				@Pc(28) long local28 = 0L;
				while (true) {
					label105: while (true) {
						if (local28 > 48L) {
							continue label110;
						}
						@Pc(38) int local38 = (int) (local26 >>> (int) local28 & 0xFFFFL);
						if (local38 <= 0) {
							continue label110;
						}
						@Pc(46) Class367 local46 = Static90.aClass367Array1[local38 - 1];
						for (local48 = 0; local48 < local7; local48++) {
							if (arg0[local48] == local46.aClass2_Sub24_3) {
								local28 += 16L;
								continue label105;
							}
						}
						arg0[local7++] = local46.aClass2_Sub24_3;
						if (local7 == 4) {
							break label112;
						}
						local28 += 16L;
					}
				}
			}
		}
		for (@Pc(108) int local108 = local7; local108 < 4; local108++) {
			arg0[local108] = null;
		}
		if (this.aByte118 != 0) {
			@Pc(129) int local129 = this.aShort117 - Static566.anInt9234;
			local48 = this.aShort119 - Static370.anInt5837;
			@Pc(164) short local164;
			@Pc(153) int local153;
			@Pc(161) int local161;
			@Pc(156) short local156;
			if (this.aByte118 == 1) {
				if (local48 > local129) {
					local153 = this.aShort117 + 1;
					local156 = this.aShort119;
					local161 = this.aShort119 - 1;
					local164 = this.aShort117;
				} else {
					local161 = this.aShort119 + 1;
					local153 = this.aShort117 - 1;
					local164 = this.aShort117;
					local156 = this.aShort119;
				}
			} else if (-local129 < local48) {
				local164 = this.aShort117;
				local161 = this.aShort119 - 1;
				local153 = this.aShort117 - 1;
				local156 = this.aShort119;
			} else {
				local164 = this.aShort117;
				local156 = this.aShort119;
				local153 = this.aShort117 + 1;
				local161 = this.aShort119 + 1;
			}
			label76: for (@Pc(228) int local228 = 0; local228 < local7; local228++) {
				@Pc(239) long local239 = Static478.aLongArrayArrayArray4[super.aByte127][local164][local161];
				@Pc(250) Class367 local250;
				while (local239 != 0L) {
					local250 = Static90.aClass367Array1[(int) ((local239 & 0xFFFFL) - 1L)];
					local239 >>>= 0x10;
					if (arg0[local228] == local250.aClass2_Sub24_3) {
						continue label76;
					}
				}
				local239 = Static478.aLongArrayArrayArray4[super.aByte127][local153][local156];
				while (local239 != 0L) {
					local250 = Static90.aClass367Array1[(int) ((local239 & 0xFFFFL) - 1L)];
					local239 >>>= 0x10;
					if (local250.aClass2_Sub24_3 == arg0[local228]) {
						continue label76;
					}
				}
				for (@Pc(306) int local306 = local228; local306 < local7 - 1; local306++) {
					arg0[local306] = arg0[local306 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(Z)V")
	public void method7691() {
	}
}
