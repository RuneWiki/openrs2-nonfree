import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public final class Class366 {

	@OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
	private final int anInt10319;

	@OriginalMember(owner = "client!wca", name = "j", descriptor = "I")
	private final int anInt10322;

	@OriginalMember(owner = "client!wca", name = "n", descriptor = "Z")
	private final boolean aBoolean867;

	@OriginalMember(owner = "client!wca", name = "m", descriptor = "Z")
	private final boolean aBoolean866;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(ZIIZ)V")
	public Class366(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt10319 = arg2;
		this.anInt10322 = arg1;
		this.aBoolean867 = arg0;
		this.aBoolean866 = arg3;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)Z")
	public boolean method8476() {
		return this.aBoolean866;
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)I")
	public int method8480() {
		return this.anInt10322;
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)I")
	public int method8482() {
		return this.anInt10319;
	}

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "(I)Z")
	public boolean method8483() {
		return this.aBoolean867;
	}
}
