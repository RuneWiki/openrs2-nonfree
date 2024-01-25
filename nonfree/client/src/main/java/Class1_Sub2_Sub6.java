import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public abstract class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rda", name = "w", descriptor = "Z")
	public boolean aBoolean496;

	@OriginalMember(owner = "client!rda", name = "z", descriptor = "Z")
	public boolean aBoolean498;

	@OriginalMember(owner = "client!rda", name = "x", descriptor = "Z")
	public volatile boolean aBoolean497 = true;

	static {
		new Class45("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)[B")
	public abstract byte[] method6032();

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)I")
	public abstract int method6033();
}
