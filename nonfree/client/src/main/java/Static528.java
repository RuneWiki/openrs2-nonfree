import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "Lclient!md;")
	public static Interface15 anInterface15_1;

	@OriginalMember(owner = "client!rw", name = "j", descriptor = "I")
	public static int anInt8748;

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "[C")
	public static final char[] aCharArray14 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_83 = new Class305(28, -1);

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "Lclient!uaa;")
	public static Class345 aClass345_11 = null;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(III)Z")
	public static boolean method7441(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static141.method2482(arg0, arg1) & Static616.method8392(arg1, arg0);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILclient!vba;)V")
	public static void method7442(@OriginalArg(1) Class5_Sub3_Sub20 arg0) {
		if (arg0 == null) {
			return;
		}
		Static231.aClass114_24.method2807(arg0);
		Static483.anInt8099++;
		@Pc(35) Class5_Sub3_Sub15 local35;
		if (arg0.aBoolean871 || "".equals(arg0.aString101)) {
			local35 = new Class5_Sub3_Sub15(arg0.aString101);
			Static248.anInt4552++;
		} else {
			@Pc(43) long local43 = arg0.aLong290;
			for (local35 = (Class5_Sub3_Sub15) Static254.aClass300_18.method7188(local43); local35 != null && !local35.aString76.equals(arg0.aString101); local35 = (Class5_Sub3_Sub15) Static254.aClass300_18.method7187()) {
			}
			if (local35 == null) {
				local35 = (Class5_Sub3_Sub15) Static145.aClass340_16.method7999(local43);
				if (local35 != null && !local35.aString76.equals(arg0.aString101)) {
					local35 = null;
				}
				if (local35 == null) {
					local35 = new Class5_Sub3_Sub15(arg0.aString101);
				}
				Static254.aClass300_18.method7191(local35, local43);
				Static248.anInt4552++;
			}
		}
		if (local35.method6807(arg0)) {
			Static441.method6441(local35);
		}
	}
}
