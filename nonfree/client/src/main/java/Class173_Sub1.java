import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class173_Sub1 extends Class173 {

	@OriginalMember(owner = "client!oq", name = "r", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_105 = new Class79("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!oq", name = "x", descriptor = "[I")
	public static final int[] anIntArray323 = new int[13];

	@OriginalMember(owner = "client!oq", name = "v", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_106 = new Class79("M", "M", "M", "M");

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
	private final int anInt4769;

	@OriginalMember(owner = "client!oq", name = "s", descriptor = "I")
	private final int anInt4775;

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
	private final int anInt4771;

	@OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
	private final int anInt4770;

	static {
		new Class79("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(IIIIII)V", line = 817)
	public Class173_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4769 = arg1;
		this.anInt4775 = arg2;
		this.anInt4771 = arg0;
		this.anInt4770 = arg3;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBI)V", line = 715)
	@Override
	public void method6249(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)V", line = 784)
	@Override
	public void method6251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt4771 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt4775 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt4769 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt4770 >> 12;
		Static358.method6417(local31, local17, local10, local24, super.anInt6983);
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(III)V", line = 837)
	@Override
	public void method6252(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
