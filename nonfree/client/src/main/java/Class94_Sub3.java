import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class94_Sub3 extends Class94 {

	@OriginalMember(owner = "client!vca", name = "w", descriptor = "[C")
	private static final char[] aCharArray8 = new char[64];

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray8[local4] = (char) (local4 + 65);
		}
		for (@Pc(18) int local18 = 26; local18 < 52; local18++) {
			aCharArray8[local18] = (char) (local18 + 97 - 26);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray8[local36] = (char) (local36 + 48 - 52);
		}
		aCharArray8[63] = '-';
		aCharArray8[62] = '*';
	}

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lclient!wia;Lclient!wia;Lclient!wd;)V")
	public Class94_Sub3(@OriginalArg(0) Class386 arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(2) Class92_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method8745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static677.aClass137_47.method7927(arg1 - 2, arg0, super.aClass92_5.anInt10903 + 4, super.aClass92_5.anInt10907 + 2, ((Class92_Sub3) super.aClass92_5).anInt10915, 0);
		Static677.aClass137_47.method7927(arg1 - 1, arg0 + 1, super.aClass92_5.anInt10903 + 2, super.aClass92_5.anInt10907, 0, 0);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IBIZ)V")
	@Override
	protected void method8743(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.method8744() * super.aClass92_5.anInt10903 / 10000;
		Static677.aClass137_47.aa(arg0, arg1 + 2, local20, super.aClass92_5.anInt10907 - 2, ((Class92_Sub3) super.aClass92_5).anInt10918, 0);
		Static677.aClass137_47.aa(local20 + arg0, arg1 - -2, super.aClass92_5.anInt10903 - local20, super.aClass92_5.anInt10907 + -2, 0, 0);
	}
}
