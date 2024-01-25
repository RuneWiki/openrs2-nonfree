import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class129_Sub1 extends Class129 implements Interface9 {

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
	private int anInt3929;

	static {
		new Class21("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
		new Class21("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!bt;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class129_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt3929 = arg1;
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!bt;I[BI)V")
	public Class129_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3929 = arg1;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III[B)V")
	@Override
	public void method4493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method4362(arg2, arg1);
		this.anInt3929 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)I")
	@Override
	public int method4494() {
		return this.anInt3929;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
	@Override
	public int method4496() {
		return 0;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)J")
	@Override
	public long method4495() {
		return super.aNativeBuffer3.a();
	}
}
