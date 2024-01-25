import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class Class152 {

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "Z")
	private final boolean aBoolean598;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
	private final int anInt6612;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
	private int anInt6615;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "Lclient!fd;")
	protected final Class19_Sub2 aClass19_Sub2_37;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
	protected final int anInt6614;

	static {
		new Class83("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!fd;I[BIZ)V")
	public Class152(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean598 = arg4;
		this.anInt6612 = arg1;
		this.anInt6615 = arg3;
		this.aClass19_Sub2_37 = arg0;
		OpenGL.glGenBuffersARB(1, Static235.anIntArray299, 0);
		this.anInt6614 = Static235.anIntArray299[0];
		this.method5179();
		OpenGL.glBufferDataARBub(arg1, this.anInt6615, arg2, 0, this.aBoolean598 ? 35040 : 35044);
		this.aClass19_Sub2_37.anInt2280 += this.anInt6615;
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!fd;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class152(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6612 = arg1;
		this.anInt6615 = arg3;
		this.aClass19_Sub2_37 = arg0;
		this.aBoolean598 = arg4;
		OpenGL.glGenBuffersARB(1, Static235.anIntArray299, 0);
		this.anInt6614 = Static235.anIntArray299[0];
		this.method5179();
		OpenGL.glBufferDataARBa(arg1, this.anInt6615, arg2.c(), this.aBoolean598 ? 35040 : 35044);
		this.aClass19_Sub2_37.anInt2280 += this.anInt6615;
	}

	@OriginalMember(owner = "client!rg", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass19_Sub2_37.method1939(this.anInt6614, this.anInt6615);
		super.finalize();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II[B)V")
	protected final void method5177(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method5179();
		if (this.anInt6615 < arg0) {
			OpenGL.glBufferDataARBub(this.anInt6612, arg0, arg1, 0, this.aBoolean598 ? 35040 : 35044);
			this.aClass19_Sub2_37.anInt2280 += arg0 - this.anInt6615;
			this.anInt6615 = arg0;
		} else {
			OpenGL.glBufferSubDataARB(this.anInt6612, 0, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
	protected abstract void method5179();
}
