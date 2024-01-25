import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class89_Sub1 extends Class89 implements Interface9 {

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
	private int anInt2397;

	static {
		new Class174("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!nq;I[BI)V")
	public Class89_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2397 = arg1;
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!nq;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class89_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt2397 = arg1;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)J")
	@Override
	public long method2081() {
		return super.aNativeBuffer4.b();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III[B)V")
	@Override
	public void method2083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method3410(arg2, arg1);
		this.anInt2397 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)I")
	@Override
	public int method2080() {
		return 0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)I")
	@Override
	public int method2082() {
		return this.anInt2397;
	}
}
