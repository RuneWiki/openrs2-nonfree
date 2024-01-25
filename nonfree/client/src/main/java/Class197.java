import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.te;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class197 implements Interface11 {

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
	private int anInt5519;

	@OriginalMember(owner = "client!mea", name = "f", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!mea", name = "g", descriptor = "I")
	private int anInt5520;

	@OriginalMember(owner = "client!mea", name = "d", descriptor = "Z")
	private boolean aBoolean352 = false;

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "Lclient!ui;")
	private final Class121_Sub2_Sub2 aClass121_Sub2_Sub2_4;

	@OriginalMember(owner = "client!mea", name = "e", descriptor = "Z")
	private final boolean aBoolean353;

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "Lclient!eea;")
	private final Class82 aClass82_15;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!ui;Lclient!eea;Z)V")
	public Class197(@OriginalArg(0) Class121_Sub2_Sub2 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass121_Sub2_Sub2_4 = arg0;
		this.aBoolean353 = arg2;
		this.aClass82_15 = arg1;
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(B)Lclient!eea;")
	@Override
	public Class82 method6271() {
		return this.aClass82_15;
	}

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "(B)I")
	@Override
	public int method7559() {
		return this.anInt5520;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(II)V")
	@Override
	public void method7560(@OriginalArg(0) int arg0) {
		this.anInt5520 = this.aClass82_15.anInt2007 * arg0;
		if (this.anInt5519 >= this.anInt5520) {
			return;
		}
		@Pc(25) short local25 = 8;
		@Pc(34) byte local34;
		if (this.aBoolean353) {
			local25 = 520;
			local34 = 0;
		} else {
			local34 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -77);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass121_Sub2_Sub2_4.anIDirect3DDevice1.a(this.anInt5520, local25, Static108.aClass82_9 == this.aClass82_15 ? 101 : 102, local34, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt5519 = this.anInt5520;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7569() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(11) boolean local11 = this.aBoolean353 & true;
		if (!this.aBoolean352 && te.a(2005530599, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt5519, local11 ? 8192 : 0, this.aClass121_Sub2_Sub2_4.aGeometryBuffer1))) {
			this.aBoolean352 = true;
			return this.aClass121_Sub2_Sub2_4.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)V")
	@Override
	public void method7567() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -81);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt5520 = 0;
		this.anInt5519 = 0;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7563() {
		if (this.aBoolean352 && te.a(2005530599, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean352 = false;
			return true;
		} else {
			return false;
		}
	}
}
