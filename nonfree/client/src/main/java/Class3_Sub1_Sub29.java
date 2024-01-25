import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class3_Sub1_Sub29 extends Class3_Sub1 {

	@OriginalMember(owner = "client!sl", name = "L", descriptor = "I")
	private int anInt9059 = 5;

	@OriginalMember(owner = "client!sl", name = "N", descriptor = "[S")
	private short[] aShortArray119 = new short[512];

	@OriginalMember(owner = "client!sl", name = "O", descriptor = "I")
	private int anInt9055 = 1;

	@OriginalMember(owner = "client!sl", name = "E", descriptor = "[B")
	private byte[] aByteArray88 = new byte[512];

	@OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
	private int anInt9064 = 2048;

	@OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
	private int anInt9058 = 0;

	@OriginalMember(owner = "client!sl", name = "M", descriptor = "I")
	private int anInt9063 = 5;

	@OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
	private int anInt9056 = 2;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
	@Override
	public void method9578() {
		this.aByteArray88 = Static179.method2870(this.anInt9058);
		this.method7683();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt9063 = this.anInt9059 = arg1.method2048(255);
		} else if (arg0 == 1) {
			this.anInt9058 = arg1.method2048(255);
		} else if (arg0 == 2) {
			this.anInt9064 = arg1.method2028(-14795);
		} else if (arg0 == 3) {
			this.anInt9056 = arg1.method2048(255);
		} else if (arg0 == 4) {
			this.anInt9055 = arg1.method2048(255);
		} else if (arg0 == 5) {
			this.anInt9063 = arg1.method2048(255);
		} else if (arg0 == 6) {
			this.anInt9059 = arg1.method2048(255);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(32) int local32 = Static121.anIntArray145[arg0] * this.anInt9059 + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static379.anInt5859; local42++) {
				Static100.anInt2142 = Integer.MAX_VALUE;
				Static180.anInt3144 = Integer.MAX_VALUE;
				Static385.anInt5972 = Integer.MAX_VALUE;
				Static413.anInt6374 = Integer.MAX_VALUE;
				@Pc(62) int local62 = Static497.anIntArray579[local42] * this.anInt9063 + 2048;
				@Pc(66) int local66 = local62 >> 12;
				@Pc(70) int local70 = local66 + 1;
				@Pc(168) int local168;
				for (@Pc(74) int local74 = local36 - 1; local74 <= local40; local74++) {
					@Pc(102) int local102 = this.aByteArray88[(this.anInt9059 > local74 ? local74 : local74 - this.anInt9059) & 0xFF] & 0xFF;
					for (@Pc(106) int local106 = local66 - 1; local106 <= local70; local106++) {
						@Pc(139) int local139 = (this.aByteArray88[local102 + (local106 >= this.anInt9063 ? local106 - this.anInt9063 : local106) & 0xFF] & 0xFF) * 2;
						@Pc(145) int local145 = local62 - (local106 << 12);
						@Pc(149) int local149 = local139 + 1;
						@Pc(153) int local153 = local145 - this.aShortArray119[local139];
						@Pc(165) int local165 = local32 - this.aShortArray119[local149] - (local74 << 12);
						local168 = this.anInt9055;
						@Pc(209) int local209;
						if (local168 == 1) {
							local209 = local165 * local165 + local153 * local153 >> 12;
						} else if (local168 == 3) {
							local165 = local165 < 0 ? -local165 : local165;
							local153 = local153 < 0 ? -local153 : local153;
							local209 = local165 >= local153 ? local165 : local153;
						} else if (local168 == 4) {
							local153 = (int) (Math.sqrt((double) ((float) (local153 < 0 ? -local153 : local153) / 4096.0F)) * 4096.0D);
							local165 = (int) (Math.sqrt((double) ((float) (local165 < 0 ? -local165 : local165) / 4096.0F)) * 4096.0D);
							local209 = local153 + local165;
							local209 = local209 * local209 >> 12;
						} else if (local168 == 5) {
							local153 *= local153;
							local165 *= local165;
							local209 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local165 + local153) / 1.6777216E7F))) * 4096.0D);
						} else if (local168 == 2) {
							local209 = (local153 >= 0 ? local153 : -local153) + (local165 >= 0 ? local165 : -local165);
						} else {
							local209 = (int) (Math.sqrt((double) ((float) (local153 * local153 + local165 * local165) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static413.anInt6374 > local209) {
							Static100.anInt2142 = Static180.anInt3144;
							Static180.anInt3144 = Static385.anInt5972;
							Static385.anInt5972 = Static413.anInt6374;
							Static413.anInt6374 = local209;
						} else if (local209 < Static385.anInt5972) {
							Static100.anInt2142 = Static180.anInt3144;
							Static180.anInt3144 = Static385.anInt5972;
							Static385.anInt5972 = local209;
						} else if (local209 < Static180.anInt3144) {
							Static100.anInt2142 = Static180.anInt3144;
							Static180.anInt3144 = local209;
						} else if (local209 < Static100.anInt2142) {
							Static100.anInt2142 = local209;
						}
					}
				}
				local168 = this.anInt9056;
				if (local168 == 0) {
					local19[local42] = Static413.anInt6374;
				} else if (local168 == 1) {
					local19[local42] = Static385.anInt5972;
				} else if (local168 == 3) {
					local19[local42] = Static180.anInt3144;
				} else if (local168 == 4) {
					local19[local42] = Static100.anInt2142;
				} else if (local168 == 2) {
					local19[local42] = Static385.anInt5972 - Static413.anInt6374;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)V")
	private void method7683() {
		@Pc(12) Random local12 = new Random((long) this.anInt9058);
		this.aShortArray119 = new short[512];
		if (this.anInt9064 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray119[local24] = (short) Static19.method614(local12, this.anInt9064);
			}
		}
	}
}
