import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public final class Class141_Sub1 extends Class141 implements Runnable {

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
	public int anInt6110 = -1;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "Z")
	private boolean aBoolean505 = true;

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "Lclient!nl;")
	private final Class135_Sub1 aClass135_Sub1_1;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!nl;)V")
	public Class141_Sub1(@OriginalArg(0) Class135_Sub1 arg0) {
		this.aClass135_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
	public void method5297() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public void method5299() {
		this.aBoolean505 = false;
	}

	@OriginalMember(owner = "client!ua", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean505) {
			this.aClass135_Sub1_1.method3681(this);
		}
	}
}
