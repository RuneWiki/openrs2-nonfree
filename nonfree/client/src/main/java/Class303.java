import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public final class Class303 {

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
	public int anInt8667;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
	public int anInt8668;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
	public int anInt8669;

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
	public int anInt8670;

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
	public int anInt8673;

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
	public int anInt8676;

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
	public int anInt8679;

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
	public int anInt8671 = 128;

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
	public int anInt8678 = 128;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
	public int anInt8675;

	static {
		new Class306("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(I)V")
	public Class303(@OriginalArg(0) int arg0) {
		this.anInt8675 = arg0;
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(IIIIII)V")
	private Class303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8679 = arg5;
		this.anInt8671 = arg2;
		this.anInt8669 = arg3;
		this.anInt8673 = arg4;
		this.anInt8675 = arg0;
		this.anInt8678 = arg1;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)Lclient!vm;")
	public Class303 method7110() {
		return new Class303(this.anInt8675, this.anInt8678, this.anInt8671, this.anInt8669, this.anInt8673, this.anInt8679);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!vm;)V")
	public void method7111(@OriginalArg(1) Class303 arg0) {
		this.anInt8671 = arg0.anInt8671;
		this.anInt8679 = arg0.anInt8679;
		this.anInt8673 = arg0.anInt8673;
		this.anInt8675 = arg0.anInt8675;
		this.anInt8669 = arg0.anInt8669;
		this.anInt8678 = arg0.anInt8678;
	}
}
