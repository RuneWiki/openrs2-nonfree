import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tga")
public final class Class347 {

	@OriginalMember(owner = "client!tga", name = "n", descriptor = "Lclient!mba;")
	public Class230 aClass230_9;

	@OriginalMember(owner = "client!tga", name = "y", descriptor = "Lclient!qaa;")
	public Class278 aClass278_2;

	@OriginalMember(owner = "client!tga", name = "v", descriptor = "Lclient!k;")
	public Class197 aClass197_2;

	@OriginalMember(owner = "client!tga", name = "C", descriptor = "Lclient!ho;")
	public Class160 aClass160_242;

	@OriginalMember(owner = "client!tga", name = "z", descriptor = "I")
	public int anInt9627;

	@OriginalMember(owner = "client!tga", name = "w", descriptor = "Lclient!ho;")
	public Class160 aClass160_243;

	@OriginalMember(owner = "client!tga", name = "l", descriptor = "I")
	public int anInt9629;

	@OriginalMember(owner = "client!tga", name = "d", descriptor = "I")
	public int anInt9631;

	@OriginalMember(owner = "client!tga", name = "k", descriptor = "Lclient!ho;")
	public Class160 aClass160_245;

	@OriginalMember(owner = "client!tga", name = "h", descriptor = "I")
	private int anInt9633;

	@OriginalMember(owner = "client!tga", name = "q", descriptor = "Lclient!bd;")
	private final Class32 aClass32_64 = new Class32();

	@OriginalMember(owner = "client!tga", name = "x", descriptor = "I")
	private int anInt9626 = 0;

	@OriginalMember(owner = "client!tga", name = "r", descriptor = "Lclient!jc;")
	private final Class14_Sub21 aClass14_Sub21_10 = new Class14_Sub21(1350);

	@OriginalMember(owner = "client!tga", name = "t", descriptor = "Lclient!rea;")
	public final Class14_Sub21_Sub2 aClass14_Sub21_Sub2_1 = new Class14_Sub21_Sub2(15000);

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "I")
	public int anInt9628 = 0;

	@OriginalMember(owner = "client!tga", name = "u", descriptor = "Z")
	public boolean aBoolean662 = false;

	@OriginalMember(owner = "client!tga", name = "e", descriptor = "Lclient!ho;")
	public Class160 aClass160_244 = null;

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "Z")
	public boolean aBoolean663 = true;

	@OriginalMember(owner = "client!tga", name = "A", descriptor = "I")
	public int anInt9630 = 0;

	@OriginalMember(owner = "client!tga", name = "B", descriptor = "I")
	public int anInt9632 = 0;

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(Z)V")
	public void method8302() {
		if (Static530.anInt9105 % 50 == 0) {
			this.anInt9627 = this.anInt9633;
			this.anInt9629 = this.anInt9631;
			this.anInt9633 = 0;
			this.anInt9631 = 0;
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Z)V")
	public void method8303() throws IOException {
		if (this.aClass278_2 == null || this.anInt9626 <= 0) {
			return;
		}
		this.aClass14_Sub21_10.anInt8936 = 0;
		while (true) {
			@Pc(28) Class14_Sub54 local28 = (Class14_Sub54) this.aClass32_64.method584();
			if (local28 == null || this.aClass14_Sub21_10.aByteArray99.length - this.aClass14_Sub21_10.anInt8936 < local28.anInt10785) {
				this.aClass278_2.method6649(this.aClass14_Sub21_10.anInt8936, this.aClass14_Sub21_10.aByteArray99);
				this.anInt9633 += this.aClass14_Sub21_10.anInt8936;
				this.anInt9632 = 0;
				return;
			}
			this.aClass14_Sub21_10.method7743(0, local28.aClass14_Sub21_Sub2_2.aByteArray99, local28.anInt10785);
			this.anInt9626 -= local28.anInt10785;
			local28.method9513();
			local28.aClass14_Sub21_Sub2_2.method7742();
			local28.method9205();
		}
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)V")
	public void method8304() {
		this.aClass32_64.method588();
		this.anInt9626 = 0;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)V")
	public void method8306() {
		if (this.aClass278_2 != null) {
			this.aClass278_2.method6651();
			this.aClass278_2 = null;
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BLclient!vv;)V")
	public void method8308(@OriginalArg(1) Class14_Sub54 arg0) {
		this.aClass32_64.method582(arg0);
		arg0.anInt10785 = arg0.aClass14_Sub21_Sub2_2.anInt8936;
		arg0.aClass14_Sub21_Sub2_2.anInt8936 = 0;
		this.anInt9626 += arg0.anInt10785;
	}
}
