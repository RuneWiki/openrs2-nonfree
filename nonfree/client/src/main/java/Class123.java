import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class123 {

	@OriginalMember(owner = "client!g", name = "j", descriptor = "I")
	public int anInt2864;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "Lclient!ab;")
	public Class3 aClass3_3;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Z")
	public boolean aBoolean202 = true;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Z")
	public boolean aBoolean204 = false;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Z")
	public boolean aBoolean203 = true;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "I")
	public int anInt2863 = 512;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public int anInt2859 = 8;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "I")
	public int anInt2865 = 127;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "I")
	public int anInt2862 = -1;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "I")
	public int anInt2868 = -1;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "I")
	public int anInt2869 = 0;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "I")
	public int anInt2867 = 64;

	@OriginalMember(owner = "client!g", name = "v", descriptor = "I")
	public int anInt2873 = 1190717;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!rv;)V")
	public void method2559(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3642();
			if (local9 == 0) {
				return;
			}
			this.method2563(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public void method2561() {
		this.anInt2859 = this.anInt2864 | this.anInt2859 << 8;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IILclient!rv;)V")
	private void method2563(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt2869 = Static254.method3574(arg1.method3633());
		} else if (arg0 == 2) {
			this.anInt2868 = arg1.method3642();
		} else if (arg0 == 3) {
			this.anInt2868 = arg1.method3698();
			if (this.anInt2868 == 65535) {
				this.anInt2868 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean202 = false;
		} else if (arg0 == 7) {
			this.anInt2862 = Static254.method3574(arg1.method3633());
		} else if (arg0 == 8) {
			this.aClass3_3.anInt30 = this.anInt2864;
		} else if (arg0 == 9) {
			this.anInt2863 = arg1.method3698() << 2;
		} else if (arg0 == 10) {
			this.aBoolean203 = false;
		} else if (arg0 == 11) {
			this.anInt2859 = arg1.method3642();
		} else if (arg0 == 12) {
			this.aBoolean204 = true;
		} else if (arg0 == 13) {
			this.anInt2873 = arg1.method3633();
		} else if (arg0 == 14) {
			this.anInt2867 = arg1.method3642() << 2;
		} else if (arg0 == 16) {
			this.anInt2865 = arg1.method3642();
		}
	}
}
