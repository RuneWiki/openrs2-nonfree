import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class289 {

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "[I")
	public static final int[] anIntArray573 = new int[4096];

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	private final int anInt8938;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "Z")
	private final boolean aBoolean648;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	private final int anInt8943;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Z")
	private final boolean aBoolean649;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray573[local4] = Static556.method8285(local4);
		}
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(ZIIZ)V")
	public Class289(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt8938 = arg2;
		this.aBoolean648 = arg3;
		this.anInt8943 = arg1;
		this.aBoolean649 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)Z")
	public boolean method7484() {
		return this.aBoolean648;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)I")
	public int method7486() {
		return this.anInt8943;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)Z")
	public boolean method7488() {
		return this.aBoolean649;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)I")
	public int method7490() {
		return this.anInt8938;
	}
}
