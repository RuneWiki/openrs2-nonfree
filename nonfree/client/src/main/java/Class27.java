import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public final class Class27 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "Lclient!ns;")
	public Class25_Sub5 aClass25_Sub5_1;

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
	public int anInt686;

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "Lclient!bq;")
	public Class27 aClass27_1;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V")
	public void method575() {
		if (Static280.anInt4968 >= 500) {
			return;
		}
		this.anInt686 = 0;
		this.aClass27_1 = Static175.aClass27_2;
		this.aClass25_Sub5_1 = null;
		Static175.aClass27_2 = this;
		Static280.anInt4968++;
	}
}
