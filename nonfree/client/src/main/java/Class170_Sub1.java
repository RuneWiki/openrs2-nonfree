import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class170_Sub1 extends Class170 implements Interface12 {

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
	private int anInt6740;

	static {
		new Class231(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!na;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class170_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt6740 = arg1;
	}

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!na;I[BI)V")
	public Class170_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6740 = arg1;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)J")
	@Override
	public long method5417() {
		return super.aNativeBuffer4.b();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIB[B)V")
	@Override
	public void method5416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method5883(arg2, arg0);
		this.anInt6740 = arg1;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)I")
	@Override
	public int method5414() {
		return this.anInt6740;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)I")
	@Override
	public int method5415() {
		return 0;
	}
}
