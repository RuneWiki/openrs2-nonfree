import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public abstract class Class7 {

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray3 = new Object[5000];

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
	protected volatile int anInt1208 = 0;

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
	protected int anInt1211 = 0;

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
	protected int anInt1209 = 0;

	@OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
	protected volatile int anInt1210 = 0;

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "[B")
	protected final byte[] aByteArray24 = new byte[5000];

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZLclient!uaa;)V")
	public abstract void method1150(@OriginalArg(1) Class290 arg0);

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!uaa;Z)V")
	public abstract void method1151(@OriginalArg(0) Class290 arg0);

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Z)V")
	public abstract void method1152();

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IZ)V")
	public abstract void method1153(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)V")
	public abstract void method1154(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(Z)V")
	public abstract void method1155();

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!d;IBZ)V")
	public abstract void method1156(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!uaa;B)V")
	public abstract void method1157(@OriginalArg(0) Class290 arg0);
}
