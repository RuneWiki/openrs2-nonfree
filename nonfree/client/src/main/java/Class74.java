import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class74 {

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "F")
	public float aFloat34 = 1.0F;

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "F")
	public float aFloat36 = 0.25F;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "F")
	public float aFloat35 = 1.0F;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
	public int anInt2022;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
	public int anInt2027;

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
	public int anInt2030;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
	public int anInt2021;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
	public int anInt2020;

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
	public int anInt2031;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "Lclient!wm;")
	public Class3_Sub4_Sub24 aClass3_Sub4_Sub24_4;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public Class74() {
		this.anInt2022 = -50;
		this.anInt2027 = 0;
		this.aFloat39 = 1.2F;
		this.anInt2030 = Static226.anInt4374;
		this.anInt2021 = -60;
		this.anInt2020 = -50;
		this.anInt2031 = Static226.anInt4371;
		this.aFloat37 = 0.69921875F;
		this.aFloat38 = 1.1523438F;
		if (Static293.anIntArray604 != null) {
			this.aClass3_Sub4_Sub24_4 = Static316.method5027(Static293.anIntArray604[0], Static293.anIntArray604[1], Static293.anIntArray604[2], Static293.anIntArray604[3], Static293.anIntArray604[4], Static293.anIntArray604[5]);
		}
	}

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class74(@OriginalArg(0) Class3_Sub26 arg0) {
		@Pc(16) int local16 = arg0.method3915();
		if ((local16 & 0x1) == 0) {
			this.anInt2030 = Static226.anInt4374;
		} else {
			this.anInt2030 = arg0.method3896();
		}
		if ((local16 & 0x2) == 0) {
			this.aFloat38 = 1.1523438F;
		} else {
			this.aFloat38 = (float) arg0.method3948() / 256.0F;
		}
		if ((local16 & 0x4) == 0) {
			this.aFloat37 = 0.69921875F;
		} else {
			this.aFloat37 = (float) arg0.method3948() / 256.0F;
		}
		if ((local16 & 0x8) == 0) {
			this.aFloat39 = 1.2F;
		} else {
			this.aFloat39 = (float) arg0.method3948() / 256.0F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt2020 = -50;
			this.anInt2022 = -50;
			this.anInt2021 = -60;
		} else {
			this.anInt2020 = arg0.method3930();
			this.anInt2021 = arg0.method3930();
			this.anInt2022 = arg0.method3930();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt2031 = Static226.anInt4371;
		} else {
			this.anInt2031 = arg0.method3896();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt2027 = 0;
		} else {
			this.anInt2027 = arg0.method3948();
		}
		if ((local16 & 0x80) != 0) {
			this.aClass3_Sub4_Sub24_4 = Static316.method5027(arg0.method3948(), arg0.method3948(), arg0.method3948(), arg0.method3948(), arg0.method3948(), arg0.method3948());
		} else if (Static293.anIntArray604 != null) {
			this.aClass3_Sub4_Sub24_4 = Static316.method5027(Static293.anIntArray604[0], Static293.anIntArray604[1], Static293.anIntArray604[2], Static293.anIntArray604[3], Static293.anIntArray604[4], Static293.anIntArray604[5]);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!ug;)V")
	public void method1780(@OriginalArg(1) Class3_Sub26 arg0) {
		this.aFloat35 = (float) (arg0.method3915() * 8) / 255.0F;
		this.aFloat36 = (float) (arg0.method3915() * 8) / 255.0F;
		this.aFloat34 = (float) (arg0.method3915() * 8) / 255.0F;
	}
}
