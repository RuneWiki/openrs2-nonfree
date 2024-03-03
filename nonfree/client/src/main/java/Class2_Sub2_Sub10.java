import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public abstract class Class2_Sub2_Sub10 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ut", name = "B", descriptor = "I")
	public static int anInt6174 = -1;

	@OriginalMember(owner = "client!ut", name = "J", descriptor = "[I")
	public static final int[] anIntArray422 = new int[2048];

	@OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
	public static int anInt6178 = 0;

	@OriginalMember(owner = "client!ut", name = "D", descriptor = "[I")
	public static final int[] anIntArray421 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!ut", name = "F", descriptor = "Z")
	public boolean aBoolean417;

	@OriginalMember(owner = "client!ut", name = "H", descriptor = "Z")
	public boolean aBoolean418;

	@OriginalMember(owner = "client!ut", name = "E", descriptor = "Z")
	public volatile boolean aBoolean416 = true;

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "(B)[B")
	public abstract byte[] method5649();

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)I")
	public abstract int method5652();
}
