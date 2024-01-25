import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class108 {

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "F")
	public float aFloat33 = 0.25F;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "F")
	public float aFloat35 = 1.0F;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "F")
	public float aFloat37 = 1.0F;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
	public final int anInt3371;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "F")
	public final float aFloat36;

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
	public final int anInt3377;

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
	public final int anInt3374;

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "F")
	public final float aFloat38;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "F")
	public final float aFloat34;

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
	public final int anInt3379;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
	public final int anInt3370;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
	public final int anInt3375;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "Lclient!ug;")
	public final Class86 aClass86_1;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
	public Class108() {
		this.anInt3371 = 0;
		this.aFloat36 = 1.2F;
		this.anInt3377 = -60;
		this.anInt3374 = Static15.anInt219;
		this.aFloat38 = 1.1523438F;
		this.aFloat34 = 0.69921875F;
		this.anInt3379 = -50;
		this.anInt3370 = Static5.anInt68;
		this.anInt3375 = -50;
		this.aClass86_1 = Static424.aClass86_4;
	}

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!ia;)V")
	public Class108(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(14) int local14 = arg0.method1171();
		if (Static12.aClass34_Sub1_1.method5466(Static262.anInt2805) && Static194.aClass106_7.method5928() > 0) {
			if ((local14 & 0x1) == 0) {
				this.anInt3370 = Static5.anInt68;
			} else {
				this.anInt3370 = arg0.method1188();
			}
			if ((local14 & 0x2) == 0) {
				this.aFloat38 = 1.1523438F;
			} else {
				this.aFloat38 = (float) arg0.method1177() / 256.0F;
			}
			if ((local14 & 0x4) == 0) {
				this.aFloat34 = 0.69921875F;
			} else {
				this.aFloat34 = (float) arg0.method1177() / 256.0F;
			}
			if ((local14 & 0x8) == 0) {
				this.aFloat36 = 1.2F;
			} else {
				this.aFloat36 = (float) arg0.method1177() / 256.0F;
			}
		} else {
			if ((local14 & 0x1) != 0) {
				arg0.method1188();
			}
			if ((local14 & 0x2) != 0) {
				arg0.method1177();
			}
			if ((local14 & 0x4) != 0) {
				arg0.method1177();
			}
			if ((local14 & 0x8) != 0) {
				arg0.method1177();
			}
			this.aFloat38 = 1.1523438F;
			this.anInt3370 = Static5.anInt68;
			this.aFloat34 = 0.69921875F;
			this.aFloat36 = 1.2F;
		}
		if ((local14 & 0x10) == 0) {
			this.anInt3379 = -50;
			this.anInt3377 = -60;
			this.anInt3375 = -50;
		} else {
			this.anInt3379 = arg0.method1215();
			this.anInt3377 = arg0.method1215();
			this.anInt3375 = arg0.method1215();
		}
		if ((local14 & 0x20) == 0) {
			this.anInt3374 = Static15.anInt219;
		} else {
			this.anInt3374 = arg0.method1188();
		}
		if ((local14 & 0x40) == 0) {
			this.anInt3371 = 0;
		} else {
			this.anInt3371 = arg0.method1177();
		}
		if ((local14 & 0x80) == 0) {
			this.aClass86_1 = Static424.aClass86_4;
		} else {
			@Pc(218) int local218 = arg0.method1177();
			@Pc(222) int local222 = arg0.method1177();
			@Pc(226) int local226 = arg0.method1177();
			@Pc(230) int local230 = arg0.method1177();
			@Pc(234) int local234 = arg0.method1177();
			@Pc(238) int local238 = arg0.method1177();
			this.aClass86_1 = Static186.method3804(local222, local218, local234, local226, local230, local238);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLclient!hn;)Z")
	public boolean method2631(@OriginalArg(1) Class108 arg0) {
		return this.anInt3370 == arg0.anInt3370 && arg0.aFloat38 == this.aFloat38 && arg0.aFloat34 == this.aFloat34 && arg0.aFloat36 == this.aFloat36 && arg0.aFloat33 == this.aFloat33 && arg0.aFloat35 == this.aFloat35 && arg0.aFloat37 == this.aFloat37 && arg0.anInt3374 == this.anInt3374 && this.anInt3371 == arg0.anInt3371 && this.aClass86_1 == arg0.aClass86_1;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!ia;)V")
	public void method2633(@OriginalArg(1) Class1_Sub3 arg0) {
		this.aFloat35 = (float) (arg0.method1171() * 8) / 255.0F;
		this.aFloat33 = (float) (arg0.method1171() * 8) / 255.0F;
		this.aFloat37 = (float) (arg0.method1171() * 8) / 255.0F;
	}
}
