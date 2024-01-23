import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class119 {

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "F")
	public float aFloat92 = 1.0F;

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "F")
	public float aFloat93 = 0.25F;

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "F")
	public float aFloat95 = 1.0F;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
	public int anInt3251;

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "F")
	public float aFloat91;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
	public int anInt3248;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
	public int anInt3252;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
	public int anInt3253;

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "F")
	public float aFloat96;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
	public int anInt3255;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
	public int anInt3250;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "Lclient!ha;")
	public Class1_Sub2_Sub8 aClass1_Sub2_Sub8_2;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	public Class119() {
		this.anInt3251 = -50;
		this.aFloat91 = 0.69921875F;
		this.anInt3248 = -50;
		this.anInt3252 = 0;
		this.anInt3253 = -60;
		this.aFloat96 = 1.2F;
		this.aFloat94 = 1.1523438F;
		this.anInt3255 = Static34.anInt730;
		this.anInt3250 = Static34.anInt728;
		if (Static260.anIntArray612 != null) {
			this.aClass1_Sub2_Sub8_2 = Static96.method1579(Static260.anIntArray612[0], Static260.anIntArray612[1], Static260.anIntArray612[2], Static260.anIntArray612[3], Static260.anIntArray612[4], Static260.anIntArray612[5]);
		}
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class119(@OriginalArg(0) Class1_Sub18 arg0) {
		@Pc(16) int local16 = arg0.method3122();
		if ((local16 & 0x1) == 0) {
			this.anInt3250 = Static34.anInt728;
		} else {
			this.anInt3250 = arg0.method3074();
		}
		if ((local16 & 0x2) == 0) {
			this.aFloat94 = 1.1523438F;
		} else {
			this.aFloat94 = (float) arg0.method3107() / 256.0F;
		}
		if ((local16 & 0x4) == 0) {
			this.aFloat91 = 0.69921875F;
		} else {
			this.aFloat91 = (float) arg0.method3107() / 256.0F;
		}
		if ((local16 & 0x8) == 0) {
			this.aFloat96 = 1.2F;
		} else {
			this.aFloat96 = (float) arg0.method3107() / 256.0F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt3251 = -50;
			this.anInt3248 = -50;
			this.anInt3253 = -60;
		} else {
			this.anInt3251 = arg0.method3064();
			this.anInt3253 = arg0.method3064();
			this.anInt3248 = arg0.method3064();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt3255 = Static34.anInt730;
		} else {
			this.anInt3255 = arg0.method3074();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt3252 = 0;
		} else {
			this.anInt3252 = arg0.method3107();
		}
		if ((local16 & 0x80) != 0) {
			this.aClass1_Sub2_Sub8_2 = Static96.method1579(arg0.method3107(), arg0.method3107(), arg0.method3107(), arg0.method3107(), arg0.method3107(), arg0.method3107());
		} else if (Static260.anIntArray612 != null) {
			this.aClass1_Sub2_Sub8_2 = Static96.method1579(Static260.anIntArray612[0], Static260.anIntArray612[1], Static260.anIntArray612[2], Static260.anIntArray612[3], Static260.anIntArray612[4], Static260.anIntArray612[5]);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!jj;I)V")
	public void method2666(@OriginalArg(0) Class1_Sub18 arg0) {
		this.aFloat92 = (float) (arg0.method3122() * 8) / 255.0F;
		this.aFloat93 = (float) (arg0.method3122() * 8) / 255.0F;
		this.aFloat95 = (float) (arg0.method3122() * 8) / 255.0F;
	}
}
