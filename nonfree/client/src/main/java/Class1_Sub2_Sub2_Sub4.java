import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class1_Sub2_Sub2_Sub4 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!di", name = "fb", descriptor = "I")
	private int anInt1188 = 0;

	@OriginalMember(owner = "client!di", name = "lb", descriptor = "I")
	private int anInt1192 = 0;

	@OriginalMember(owner = "client!di", name = "ab", descriptor = "Z")
	public boolean aBoolean77 = false;

	@OriginalMember(owner = "client!di", name = "bb", descriptor = "I")
	public final int anInt1185;

	@OriginalMember(owner = "client!di", name = "kb", descriptor = "I")
	public final int anInt1191;

	@OriginalMember(owner = "client!di", name = "hb", descriptor = "I")
	public final int anInt1189;

	@OriginalMember(owner = "client!di", name = "Z", descriptor = "I")
	public final int anInt1184;

	@OriginalMember(owner = "client!di", name = "rb", descriptor = "I")
	public final int anInt1196;

	@OriginalMember(owner = "client!di", name = "jb", descriptor = "I")
	private final int anInt1190;

	@OriginalMember(owner = "client!di", name = "cb", descriptor = "Lclient!fa;")
	private Class1_Sub2_Sub8 aClass1_Sub2_Sub8_2;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(IIIIIII)V")
	public Class1_Sub2_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1185 = arg1;
		this.anInt1191 = arg4;
		this.anInt1189 = arg2;
		this.anInt1184 = arg5 + arg6;
		this.anInt1196 = arg3;
		this.anInt1190 = arg0;
		@Pc(36) int local36 = Static42.method1121(this.anInt1190).anInt478;
		if (local36 == -1) {
			this.aBoolean77 = true;
		} else {
			this.aBoolean77 = false;
			this.aClass1_Sub2_Sub8_2 = Static142.method2538(local36);
		}
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(B)Lclient!ia;")
	@Override
	protected Class1_Sub2_Sub2_Sub5 method2706() {
		@Pc(8) Class1_Sub2_Sub3 local8 = Static42.method1121(this.anInt1190);
		@Pc(17) Class1_Sub2_Sub2_Sub5 local17;
		if (this.aBoolean77) {
			local17 = local8.method530(-1);
		} else {
			local17 = local8.method530(this.anInt1188);
		}
		return local17 == null ? null : local17;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(II)V")
	public void method977(@OriginalArg(1) int arg0) {
		if (this.aBoolean77) {
			return;
		}
		this.anInt1192 += arg0;
		while (this.anInt1192 > this.aClass1_Sub2_Sub8_2.anIntArray155[this.anInt1188]) {
			this.anInt1192 -= this.aClass1_Sub2_Sub8_2.anIntArray155[this.anInt1188];
			this.anInt1188++;
			if (this.anInt1188 >= this.aClass1_Sub2_Sub8_2.anIntArray157.length) {
				this.aBoolean77 = true;
				return;
			}
		}
	}
}
