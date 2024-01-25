import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.em;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class24 implements Interface12 {

	@OriginalMember(owner = "client!b", name = "c", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "Z")
	private final boolean aBoolean22;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "Lclient!jt;")
	private final Class182 aClass182_1;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "Lclient!kfa;")
	private final Class82_Sub3_Sub2 aClass82_Sub3_Sub2_1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!kfa;Lclient!jt;Z)V")
	public Class24(@OriginalArg(0) Class82_Sub3_Sub2 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean22 = arg2;
		this.aClass182_1 = arg1;
		this.aClass82_Sub3_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7574() {
		if (this.aBoolean23 && em.a(this.anIDirect3DIndexBuffer1.Unlock(), (int) -1)) {
			this.aBoolean23 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7563(@OriginalArg(1) int arg0) {
		this.anInt414 = this.aClass182_1.anInt5379 * arg0;
		if (this.anInt414 <= this.anInt413) {
			return;
		}
		@Pc(20) short local20 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean22) {
			local20 = 520;
			local29 = 0;
		} else {
			local29 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(-10573);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass82_Sub3_Sub2_1.anIDirect3DDevice1.a(this.anInt414, local20, Static280.aClass182_9 == this.aClass182_1 ? 101 : 102, local29, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt413 = this.anInt414;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)I")
	@Override
	public int method7561() {
		return this.anInt414;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)Lclient!jt;")
	@Override
	public Class182 method7575() {
		return this.aClass182_1;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	@Override
	public void method7572() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(-10573);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt413 = 0;
		this.anInt414 = 0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7573() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(16) boolean local16 = this.aBoolean22 & true;
		if (!this.aBoolean23 && em.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt413, local16 ? 8192 : 0, this.aClass82_Sub3_Sub2_1.aGeometryBuffer1), (int) -1)) {
			this.aBoolean23 = true;
			return this.aClass82_Sub3_Sub2_1.aGeometryBuffer1;
		} else {
			return null;
		}
	}
}
