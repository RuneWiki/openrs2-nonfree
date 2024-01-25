import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!tv", name = "w", descriptor = "I")
	public static int anInt6816;

	@OriginalMember(owner = "client!tv", name = "bb", descriptor = "I")
	public static int anInt6840;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
	public static void method5332() {
		for (@Pc(10) Class3_Sub15 local10 = (Class3_Sub15) Static342.aClass229_39.method5328(); local10 != null; local10 = (Class3_Sub15) Static342.aClass229_39.method5325()) {
			if (local10.anInt2021 == -1) {
				local10.anInt2016 = 0;
				if (local10.anInt2022 >= 0 && local10.anInt2014 >= 0 && Static399.anInt6923 > local10.anInt2022 && Static127.anInt2696 > local10.anInt2014) {
					Static84.method1459(local10);
				}
			} else {
				local10.method5987();
			}
		}
	}
}
