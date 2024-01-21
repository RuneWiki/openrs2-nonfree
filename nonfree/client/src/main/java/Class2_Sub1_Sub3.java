import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
	public int anInt234;

	@OriginalMember(owner = "client!bc", name = "Z", descriptor = "Lclient!je;")
	public Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!bc", name = "db", descriptor = "B")
	public byte aByte1;
}
