import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class101 {

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "[J")
	private final long[] aLongArray2 = new long[8];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "[J")
	private final long[] aLongArray1 = new long[8];

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "[J")
	private final long[] aLongArray4 = new long[8];

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "[B")
	private final byte[] aByteArray33 = new byte[64];

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
	private int anInt3159 = 0;

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
	private int anInt3161 = 0;

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "[J")
	private final long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "[J")
	private final long[] aLongArray3 = new long[8];

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "[B")
	private final byte[] aByteArray34 = new byte[32];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
	private void method2845() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		while (local3 < 8) {
			this.aLongArray3[local3] = Static581.method6765(Static504.method6795((long) this.aByteArray33[local5 + 7], 255L), Static581.method6765(Static504.method6795(0xFFL << 8, (long) this.aByteArray33[local5 + 6] << 8), Static581.method6765(Static504.method6795(0xFFL << 16, (long) this.aByteArray33[local5 + 5] << 16), Static581.method6765(Static581.method6765(Static504.method6795(255L, (long) this.aByteArray33[local5 + 3]) << 32, Static581.method6765(Static581.method6765((long) this.aByteArray33[local5] << 56, Static504.method6795((long) this.aByteArray33[local5 + 1] << 48, 0xFFL << 48)), Static504.method6795((long) this.aByteArray33[local5 + 2], 255L) << 40)), Static504.method6795(0xFFL << 24, (long) this.aByteArray33[local5 + 4] << 24)))));
			local5 += 8;
			local3++;
		}
		for (@Pc(123) int local123 = 0; local123 < 8; local123++) {
			this.aLongArray4[local123] = Static581.method6765(this.aLongArray3[local123], this.aLongArray2[local123] = this.aLongArray1[local123]);
		}
		@Pc(155) int local155;
		for (@Pc(151) int local151 = 1; local151 <= 10; local151++) {
			@Pc(164) int local164;
			@Pc(166) int local166;
			for (local155 = 0; local155 < 8; local155++) {
				this.aLongArray5[local155] = 0L;
				local164 = 0;
				local166 = 56;
				while (local164 < 8) {
					this.aLongArray5[local155] = Static581.method6765(this.aLongArray5[local155], Class3_Sub6_Sub38.aLongArrayArray1[local164][(int) (this.aLongArray2[local155 - local164 & 0x7] >>> local166) & 0xFF]);
					local164++;
					local166 -= 8;
				}
			}
			for (local164 = 0; local164 < 8; local164++) {
				this.aLongArray2[local164] = this.aLongArray5[local164];
			}
			this.aLongArray2[0] = Static581.method6765(this.aLongArray2[0], Class3_Sub6_Sub38.aLongArray16[local151]);
			@Pc(249) int local249;
			for (local166 = 0; local166 < 8; local166++) {
				this.aLongArray5[local166] = this.aLongArray2[local166];
				local249 = 0;
				@Pc(251) int local251 = 56;
				while (local249 < 8) {
					this.aLongArray5[local166] = Static581.method6765(this.aLongArray5[local166], Class3_Sub6_Sub38.aLongArrayArray1[local249][(int) (this.aLongArray4[local166 - local249 & 0x7] >>> local251) & 0xFF]);
					local249++;
					local251 -= 8;
				}
			}
			for (local249 = 0; local249 < 8; local249++) {
				this.aLongArray4[local249] = this.aLongArray5[local249];
			}
		}
		for (local155 = 0; local155 < 8; local155++) {
			this.aLongArray1[local155] = Static581.method6765(this.aLongArray1[local155], Static581.method6765(this.aLongArray4[local155], this.aLongArray3[local155]));
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([BZJ)V")
	public void method2846(@OriginalArg(0) byte[] arg0, @OriginalArg(2) long arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(21) int local21 = this.anInt3161 & 0x7;
		@Pc(23) long local23 = arg1;
		@Pc(25) int local25 = 31;
		@Pc(27) int local27 = 0;
		while (local25 >= 0) {
			local27 += (this.aByteArray34[local25] & 0xFF) + ((int) local23 & 0xFF);
			this.aByteArray34[local25] = (byte) local27;
			local23 >>>= 0x8;
			local27 >>>= 0x8;
			local25--;
		}
		@Pc(86) int local86;
		while (arg1 > 8L) {
			local86 = arg0[local7] << local16 & 0xFF | (arg0[local7 + 1] & 0xFF) >>> 8 - local16;
			if (local86 < 0 || local86 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray33[this.anInt3159] = (byte) (this.aByteArray33[this.anInt3159] | local86 >>> local21);
			this.anInt3159++;
			this.anInt3161 += 8 - local21;
			if (this.anInt3161 == 512) {
				this.method2845();
				this.anInt3161 = this.anInt3159 = 0;
			}
			this.aByteArray33[this.anInt3159] = (byte) (local86 << 8 - local21 & 0xFF);
			this.anInt3161 += local21;
			arg1 -= 8L;
			local7++;
		}
		if (arg1 > 0L) {
			local86 = arg0[local7] << local16 & 0xFF;
			this.aByteArray33[this.anInt3159] = (byte) (this.aByteArray33[this.anInt3159] | local86 >>> local21);
		} else {
			local86 = 0;
		}
		if (arg1 + (long) local21 < 8L) {
			this.anInt3161 = (int) ((long) this.anInt3161 + arg1);
			return;
		}
		this.anInt3161 += 8 - local21;
		this.anInt3159++;
		arg1 -= 8 - local21;
		if (this.anInt3161 == 512) {
			this.method2845();
			this.anInt3161 = this.anInt3159 = 0;
		}
		this.aByteArray33[this.anInt3159] = (byte) (local86 << 8 - local21 & 0xFF);
		this.anInt3161 += (int) arg1;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	public void method2847() {
		for (@Pc(3) int local3 = 0; local3 < 32; local3++) {
			this.aByteArray34[local3] = 0;
		}
		this.anInt3161 = this.anInt3159 = 0;
		this.aByteArray33[0] = 0;
		for (@Pc(36) int local36 = 0; local36 < 8; local36++) {
			this.aLongArray1[local36] = 0L;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II[B)V")
	public void method2849(@OriginalArg(2) byte[] arg0) {
		this.aByteArray33[this.anInt3159] = (byte) (this.aByteArray33[this.anInt3159] | 0x80 >>> (this.anInt3161 & 0x7));
		this.anInt3159++;
		if (this.anInt3159 > 32) {
			while (true) {
				if (this.anInt3159 >= 64) {
					this.method2845();
					this.anInt3159 = 0;
					break;
				}
				this.aByteArray33[this.anInt3159++] = 0;
			}
		}
		while (this.anInt3159 < 32) {
			this.aByteArray33[this.anInt3159++] = 0;
		}
		Static601.method2816(this.aByteArray34, 0, this.aByteArray33, 32, 32);
		this.method2845();
		@Pc(86) int local86 = 0;
		@Pc(92) int local92 = 0;
		while (local86 < 8) {
			@Pc(99) long local99 = this.aLongArray1[local86];
			arg0[local92] = (byte) (local99 >>> 56);
			arg0[local92 + 1] = (byte) (local99 >>> 48);
			arg0[local92 + 2] = (byte) (local99 >>> 40);
			arg0[local92 + 3] = (byte) (local99 >>> 32);
			arg0[local92 + 4] = (byte) (local99 >>> 24);
			arg0[local92 + 5] = (byte) (local99 >>> 16);
			arg0[local92 + 6] = (byte) (local99 >>> 8);
			arg0[local92 + 7] = (byte) local99;
			local86++;
			local92 += 8;
		}
	}
}
