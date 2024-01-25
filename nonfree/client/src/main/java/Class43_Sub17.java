import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public final class Class43_Sub17 extends Class43 {

	@OriginalMember(owner = "client!kda", name = "s", descriptor = "[Lclient!ua;")
	private static final Class358[] aClass358Array1 = new Class358[32];

	static {
		@Pc(128) Class358[] local128 = Static654.method9151();
		for (@Pc(130) int local130 = 0; local130 < local128.length; local130++) {
			aClass358Array1[local128[local130].anInt9944] = local128[local130];
		}
	}

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!lha;)V")
	public Class43_Sub17(@OriginalArg(0) Class14_Sub26 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(ILclient!lha;)V")
	public Class43_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub26 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)I")
	public int method4949() {
		return super.anInt10397;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)Z")
	public boolean method4950() {
		return Static461.method6793(super.aClass14_Sub26_32.aClass43_Sub1_1.method801());
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)I")
	@Override
	protected int method8889() {
		return 0;
	}

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "(II)I")
	@Override
	public int method8894(@OriginalArg(0) int arg0) {
		return Static461.method6793(super.aClass14_Sub26_32.aClass43_Sub1_1.method801()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)V")
	@Override
	protected void method8893(@OriginalArg(1) int arg0) {
		super.anInt10397 = arg0;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(B)V")
	@Override
	public void method8892() {
		if (super.aClass14_Sub26_32.aClass43_Sub1_1.method797() && !Static461.method6793(super.aClass14_Sub26_32.aClass43_Sub1_1.method801())) {
			super.anInt10397 = 0;
		}
		if (super.anInt10397 < 0 || super.anInt10397 > 2) {
			super.anInt10397 = this.method8889();
		}
	}
}
