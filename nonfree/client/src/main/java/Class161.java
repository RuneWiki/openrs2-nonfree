import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Class161 {

	@OriginalMember(owner = "client!k", name = "b", descriptor = "I")
	private final int anInt5927;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "Z")
	private final boolean aBoolean466;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "Z")
	private final boolean aBoolean467;

	@OriginalMember(owner = "client!k", name = "o", descriptor = "I")
	private final int anInt5935;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(ZIIZ)V")
	public Class161(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt5927 = arg2;
		this.aBoolean466 = arg0;
		this.aBoolean467 = arg3;
		this.anInt5935 = arg1;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)Z")
	public boolean method4945() {
		return this.aBoolean467;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)Z")
	public boolean method4946() {
		return this.aBoolean466;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)I")
	public int method4947() {
		return this.anInt5935;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(I)I")
	public int method4948() {
		return this.anInt5927;
	}
}
