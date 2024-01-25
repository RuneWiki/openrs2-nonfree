import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class3_Sub4_Sub32 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
	private int anInt6955 = 2048;

	@OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
	private int anInt6958 = 5;

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "[B")
	private byte[] aByteArray72 = new byte[512];

	@OriginalMember(owner = "client!ud", name = "U", descriptor = "[S")
	private short[] aShortArray86 = new short[512];

	@OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
	private int anInt6954 = 0;

	@OriginalMember(owner = "client!ud", name = "W", descriptor = "I")
	private int anInt6960 = 5;

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
	private int anInt6953 = 1;

	@OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
	private int anInt6959 = 2;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt6958 = this.anInt6960 = arg1.method6053();
		} else if (arg0 == 1) {
			this.anInt6954 = arg1.method6053();
		} else if (arg0 == 2) {
			this.anInt6955 = arg1.method6004();
		} else if (arg0 == 3) {
			this.anInt6959 = arg1.method6053();
		} else if (arg0 == 4) {
			this.anInt6953 = arg1.method6053();
		} else if (arg0 == 5) {
			this.anInt6958 = arg1.method6053();
		} else if (arg0 == 6) {
			this.anInt6960 = arg1.method6053();
		}
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
	@Override
	public void method5963() {
		this.aByteArray72 = Static136.method1774(this.anInt6954);
		this.method5407();
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)V")
	private void method5407() {
		@Pc(12) Random local12 = new Random((long) this.anInt6954);
		this.aShortArray86 = new short[512];
		if (this.anInt6955 > 0) {
			for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
				this.aShortArray86[local27] = (short) Static36.method851(local12, this.anInt6955);
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(29) int local29 = this.anInt6960 * Static285.anIntArray401[arg0] + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static106.anInt2356; local39++) {
				Static226.anInt4370 = Integer.MAX_VALUE;
				Static217.anInt4264 = Integer.MAX_VALUE;
				Static413.anInt3903 = Integer.MAX_VALUE;
				Static133.anInt2849 = Integer.MAX_VALUE;
				@Pc(58) int local58 = Static382.anIntArray476[local39] * this.anInt6958 + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(154) int local154;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(95) int local95 = this.aByteArray72[(local70 >= this.anInt6960 ? local70 - this.anInt6960 : local70) & 0xFF] & 0xFF;
					for (@Pc(99) int local99 = local62 - 1; local99 <= local66; local99++) {
						@Pc(125) int local125 = (this.aByteArray72[local95 + (this.anInt6958 > local99 ? local99 : local99 - this.anInt6958) & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = local125 + 1;
						@Pc(139) int local139 = local58 - this.aShortArray86[local125] - (local99 << 12);
						@Pc(151) int local151 = local29 - this.aShortArray86[local129] - (local70 << 12);
						local154 = this.anInt6953;
						@Pc(187) int local187;
						if (local154 == 1) {
							local187 = local139 * local139 + local151 * local151 >> 12;
						} else if (local154 == 3) {
							local151 = local151 < 0 ? -local151 : local151;
							local139 = local139 >= 0 ? local139 : -local139;
							local187 = local151 >= local139 ? local151 : local139;
						} else if (local154 == 4) {
							local139 = (int) (Math.sqrt((double) ((float) (local139 < 0 ? -local139 : local139) / 4096.0F)) * 4096.0D);
							local151 = (int) (Math.sqrt((double) ((float) (local151 >= 0 ? local151 : -local151) / 4096.0F)) * 4096.0D);
							local187 = local139 + local151;
							local187 = local187 * local187 >> 12;
						} else if (local154 == 5) {
							local151 *= local151;
							local139 *= local139;
							local187 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local151 + local139) / 1.6777216E7F))) * 4096.0D);
						} else if (local154 == 2) {
							local187 = (local139 >= 0 ? local139 : -local139) + (local151 >= 0 ? local151 : -local151);
						} else {
							local187 = (int) (Math.sqrt((double) ((float) (local151 * local151 + local139 * local139) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static133.anInt2849 > local187) {
							Static226.anInt4370 = Static217.anInt4264;
							Static217.anInt4264 = Static413.anInt3903;
							Static413.anInt3903 = Static133.anInt2849;
							Static133.anInt2849 = local187;
						} else if (local187 < Static413.anInt3903) {
							Static226.anInt4370 = Static217.anInt4264;
							Static217.anInt4264 = Static413.anInt3903;
							Static413.anInt3903 = local187;
						} else if (Static217.anInt4264 > local187) {
							Static226.anInt4370 = Static217.anInt4264;
							Static217.anInt4264 = local187;
						} else if (local187 < Static226.anInt4370) {
							Static226.anInt4370 = local187;
						}
					}
				}
				local154 = this.anInt6959;
				if (local154 == 0) {
					local16[local39] = Static133.anInt2849;
				} else if (local154 == 1) {
					local16[local39] = Static413.anInt3903;
				} else if (local154 == 3) {
					local16[local39] = Static217.anInt4264;
				} else if (local154 == 4) {
					local16[local39] = Static226.anInt4370;
				} else if (local154 == 2) {
					local16[local39] = Static413.anInt3903 - Static133.anInt2849;
				}
			}
		}
		return local16;
	}
}
