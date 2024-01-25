import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public abstract class Class1_Sub6_Sub2 extends Class1_Sub6 {

	@OriginalMember(owner = "client!dga", name = "z", descriptor = "[I")
	public static final int[] anIntArray676 = new int[16384];

	@OriginalMember(owner = "client!dga", name = "x", descriptor = "[I")
	public static final int[] anIntArray675 = new int[16384];

	@OriginalMember(owner = "client!dga", name = "w", descriptor = "Z")
	public boolean aBoolean689;

	@OriginalMember(owner = "client!dga", name = "A", descriptor = "Z")
	public boolean aBoolean691;

	@OriginalMember(owner = "client!dga", name = "v", descriptor = "Z")
	public volatile boolean aBoolean688 = true;

	static {
		@Pc(11) double local11 = 3.834951969714103E-4D;
		for (@Pc(13) int local13 = 0; local13 < 16384; local13++) {
			anIntArray675[local13] = (int) (Math.sin((double) local13 * local11) * 16384.0D);
			anIntArray676[local13] = (int) (Math.cos((double) local13 * local11) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)[B")
	public abstract byte[] method7266();

	@OriginalMember(owner = "client!dga", name = "e", descriptor = "(I)I")
	public abstract int method7269();
}
