import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class141_Sub2 extends Class141 implements Interface8 {

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
	private int anInt5299;

	static {
		new Class84("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!ht;I[BIZ)V")
	public Class141_Sub2(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt5299 = arg1;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)I")
	@Override
	public int method5608() {
		return super.anInt5289;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)I")
	@Override
	public int method5610() {
		return this.anInt5299;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5609(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method4265(arg0, arg1);
		this.anInt5299 = 5123;
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
	@Override
	protected void method4267() {
		super.aClass109_Sub1_36.method2604(this);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)J")
	@Override
	public long method5607() {
		return 0L;
	}
}
