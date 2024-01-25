import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public final class Class392 {

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "I")
	public int anInt10997;

	@OriginalMember(owner = "client!wga", name = "k", descriptor = "I")
	public int anInt10999;

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "I")
	public int anInt11003;

	@OriginalMember(owner = "client!wga", name = "j", descriptor = "I")
	public int anInt11002 = 128;

	@OriginalMember(owner = "client!wga", name = "h", descriptor = "I")
	public int anInt11005 = 128;

	@OriginalMember(owner = "client!wga", name = "g", descriptor = "I")
	public int anInt10998;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(I)V")
	public Class392(@OriginalArg(0) int arg0) {
		this.anInt10998 = arg0;
	}

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(IIIIII)V")
	private Class392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt10999 = arg4;
		this.anInt11002 = arg1;
		this.anInt11005 = arg2;
		this.anInt10998 = arg0;
		this.anInt11003 = arg5;
		this.anInt10997 = arg3;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)Lclient!wga;")
	public Class392 method9336() {
		return new Class392(this.anInt10998, this.anInt11002, this.anInt11005, this.anInt10997, this.anInt10999, this.anInt11003);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(BLclient!wga;)V")
	public void method9337(@OriginalArg(1) Class392 arg0) {
		this.anInt11002 = arg0.anInt11002;
		this.anInt10998 = arg0.anInt10998;
		this.anInt11003 = arg0.anInt11003;
		this.anInt10999 = arg0.anInt10999;
		this.anInt11005 = arg0.anInt11005;
		this.anInt10997 = arg0.anInt10997;
	}
}
