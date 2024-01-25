import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!me", name = "i", descriptor = "Lclient!qv;")
	public static Class279 aClass279_1;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_171 = new Class235(6, 8);

	@OriginalMember(owner = "client!me", name = "f", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Lclient!kea;")
	public static final Class187 aClass187_22 = new Class187(8);

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
	public static void method4407() {
		@Pc(5) Class222 local5 = Static218.aClass222_26;
		synchronized (Static218.aClass222_26) {
			Static218.aClass222_26.method4433(5);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)Lclient!ba;")
	public static Class23 method4409(@OriginalArg(0) int arg0) {
		@Pc(8) Class23[] local8 = Static33.method2098();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class23 local16 = local8[local10];
			if (arg0 == local16.anInt388) {
				return local16;
			}
		}
		return null;
	}
}
