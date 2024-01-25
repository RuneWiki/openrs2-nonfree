import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class Class21 {

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "Z")
	private final boolean aBoolean532;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
	private int anInt6103;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
	private final int anInt6102;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "Lclient!vj;")
	protected final Class172_Sub2 aClass172_Sub2_33;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	protected final int anInt6099;

	static {
		new Class189("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!vj;I[BIZ)V")
	public Class21(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean532 = arg4;
		this.anInt6103 = arg3;
		this.anInt6102 = arg1;
		this.aClass172_Sub2_33 = arg0;
		OpenGL.glGenBuffersARB(1, Static145.anIntArray394, 0);
		this.anInt6099 = Static145.anIntArray394[0];
		this.method4764();
		OpenGL.glBufferDataARBub(arg1, this.anInt6103, arg2, 0, this.aBoolean532 ? 35040 : 35044);
		this.aClass172_Sub2_33.anInt7168 += this.anInt6103;
	}

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!vj;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class21(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass172_Sub2_33 = arg0;
		this.aBoolean532 = arg4;
		this.anInt6102 = arg1;
		this.anInt6103 = arg3;
		OpenGL.glGenBuffersARB(1, Static145.anIntArray394, 0);
		this.anInt6099 = Static145.anIntArray394[0];
		this.method4764();
		OpenGL.glBufferDataARBa(arg1, this.anInt6103, arg2.c(), this.aBoolean532 ? 35040 : 35044);
		this.aClass172_Sub2_33.anInt7168 += this.anInt6103;
	}

	@OriginalMember(owner = "client!bg", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass172_Sub2_33.method5553(this.anInt6103, this.anInt6099);
		super.finalize();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([BII)V")
	protected final void method4763(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method4764();
		if (arg1 <= this.anInt6103) {
			OpenGL.glBufferSubDataARB(this.anInt6102, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt6102, arg1, arg0, 0, this.aBoolean532 ? 35040 : 35044);
			this.aClass172_Sub2_33.anInt7168 += arg1 - this.anInt6103;
			this.anInt6103 = arg1;
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V")
	protected abstract void method4764();
}
