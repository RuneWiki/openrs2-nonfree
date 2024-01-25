import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
	public int anInt5;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Ljava/lang/Object;")
	public volatile Object anObject1;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!aa;")
	public Class2 aClass2_1;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Ljava/lang/Object;")
	public Object anObject2;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
	public int anInt7;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
	public volatile int anInt6 = 0;
}
