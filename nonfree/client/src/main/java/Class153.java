import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class153 {

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
	public int anInt3786;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
	public int anInt3788;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
	public int anInt3789;

	static {
		new Class32("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!kk;)V")
	public void method3473(@OriginalArg(1) Class2_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5350();
			if (local9 == 0) {
				return;
			}
			this.method3475(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILclient!kk;)V")
	private void method3475(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		if (arg0 == 1) {
			this.anInt3788 = arg1.method5312();
			this.anInt3789 = arg1.method5350();
			this.anInt3786 = arg1.method5350();
		}
	}
}
