import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class119 {

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "[B")
	public static final byte[] aByteArray38;

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "F")
	public float aFloat58 = 0.25F;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "F")
	public float aFloat53 = 1.0F;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "F")
	public float aFloat57 = 1.0F;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "F")
	public final float aFloat56;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
	public final int anInt2932;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "F")
	public final float aFloat54;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
	public final int anInt2931;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	public final int anInt2927;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
	public final int anInt2924;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "F")
	public final float aFloat55;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	public final int anInt2930;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
	public final int anInt2929;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "Lclient!jba;")
	public final Class83 aClass83_2;

	static {
		@Pc(1) int local1 = 0;
		aByteArray38 = new byte[32896];
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray38[local1++] = (byte) (255.0D / Math.sqrt((double) ((float) (local9 * local9 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
	public Class119() {
		this.aFloat56 = 0.69921875F;
		this.anInt2932 = 0;
		this.aFloat54 = 1.2F;
		this.anInt2931 = Static191.anInt3566;
		this.anInt2927 = -60;
		this.anInt2924 = -50;
		this.aFloat55 = 1.1523438F;
		this.anInt2930 = -50;
		this.anInt2929 = Static324.anInt5457;
		this.aClass83_2 = Static361.aClass83_4;
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!mo;)V")
	public Class119(@OriginalArg(0) Class1_Sub35 arg0) {
		@Pc(16) int local16 = arg0.method5750();
		if (Static348.aClass1_Sub30_Sub1_1.method3907(Static113.anInt2222) && Static307.aClass134_8.method6955() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt2931 = Static191.anInt3566;
			} else {
				this.anInt2931 = arg0.method5804();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat55 = 1.1523438F;
			} else {
				this.aFloat55 = (float) arg0.method5771() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat56 = 0.69921875F;
			} else {
				this.aFloat56 = (float) arg0.method5771() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat54 = 1.2F;
			} else {
				this.aFloat54 = (float) arg0.method5771() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5804();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5771();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5771();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5771();
			}
			this.aFloat55 = 1.1523438F;
			this.aFloat54 = 1.2F;
			this.anInt2931 = Static191.anInt3566;
			this.aFloat56 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt2924 = -50;
			this.anInt2927 = -60;
			this.anInt2930 = -50;
		} else {
			this.anInt2930 = arg0.method5738();
			this.anInt2927 = arg0.method5738();
			this.anInt2924 = arg0.method5738();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt2929 = Static324.anInt5457;
		} else {
			this.anInt2929 = arg0.method5804();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt2932 = 0;
		} else {
			this.anInt2932 = arg0.method5771();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass83_2 = Static361.aClass83_4;
		} else {
			@Pc(213) int local213 = arg0.method5771();
			@Pc(217) int local217 = arg0.method5771();
			@Pc(221) int local221 = arg0.method5771();
			@Pc(225) int local225 = arg0.method5771();
			@Pc(229) int local229 = arg0.method5771();
			@Pc(233) int local233 = arg0.method5771();
			this.aClass83_2 = Static419.method5825(local229, local225, local221, local233, local217, local213);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!mo;)V")
	public void method2370(@OriginalArg(1) Class1_Sub35 arg0) {
		this.aFloat53 = (float) (arg0.method5750() * 8) / 255.0F;
		this.aFloat58 = (float) (arg0.method5750() * 8) / 255.0F;
		this.aFloat57 = (float) (arg0.method5750() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!gf;)Z")
	public boolean method2374(@OriginalArg(1) Class119 arg0) {
		return this.anInt2931 == arg0.anInt2931 && arg0.aFloat55 == this.aFloat55 && this.aFloat56 == arg0.aFloat56 && this.aFloat54 == arg0.aFloat54 && this.aFloat58 == arg0.aFloat58 && arg0.aFloat53 == this.aFloat53 && this.aFloat57 == arg0.aFloat57 && arg0.anInt2929 == this.anInt2929 && this.anInt2932 == arg0.anInt2932 && arg0.aClass83_2 == this.aClass83_2;
	}
}
