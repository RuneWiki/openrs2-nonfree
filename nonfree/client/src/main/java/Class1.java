import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	public int anInt1;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!a;")
	public Class1 aClass1_1;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Ljava/lang/Object;")
	public volatile Object anObject1;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "I")
	public int anInt3;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Ljava/lang/Object;")
	public Object anObject2;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	public volatile int anInt2 = 0;
}
