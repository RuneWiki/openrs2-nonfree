import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public abstract class Class4_Sub40 extends Class4 {

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "Z")
	public boolean aBoolean445;

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "Lclient!ug;")
	protected final Class135_Sub2 aClass135_Sub2_38;

	static {
		new Class15("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class4_Sub40(@OriginalArg(0) Class135_Sub2 arg0) {
		this.aClass135_Sub2_38 = arg0;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)I")
	public final int method5185() {
		return 1;
	}

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)Z")
	public abstract boolean method5186();

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "(I)V")
	public abstract void method5187();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)Z")
	public abstract boolean method5188();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(III)V")
	public abstract void method5191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)V")
	public abstract void method5192(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!ml;IILclient!ml;)V")
	public abstract void method5193(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class65_Sub2 arg2);

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(B)I")
	public int method5195() {
		return 0;
	}

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(B)Z")
	public final boolean method5196() {
		return false;
	}

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "(I)Z")
	public final boolean method5197() {
		return this.aBoolean445;
	}
}
