import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public final class Class186 {

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "Z")
	private final boolean aBoolean426;

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "Z")
	private final boolean aBoolean427;

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
	private final int anInt5949;

	@OriginalMember(owner = "client!kt", name = "k", descriptor = "I")
	private final int anInt5954;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(ZIIZ)V")
	public Class186(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean426 = arg0;
		this.aBoolean427 = arg3;
		this.anInt5949 = arg2;
		this.anInt5954 = arg1;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)Z")
	public boolean method4881() {
		return this.aBoolean427;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)I")
	public int method4884() {
		return this.anInt5954;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)I")
	public int method4885() {
		return this.anInt5949;
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)Z")
	public boolean method4886() {
		return this.aBoolean426;
	}
}
