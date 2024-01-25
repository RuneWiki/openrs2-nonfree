import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.ae;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class264 implements Interface13 {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	private int anInt6935;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
	private int anInt6936;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Z")
	private boolean aBoolean533 = false;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!ega;")
	private final Class78_Sub1_Sub1 aClass78_Sub1_Sub1_6;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Z")
	private final boolean aBoolean534;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Lclient!jg;")
	private final Class172 aClass172_17;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!ega;Lclient!jg;Z)V")
	public Class264(@OriginalArg(0) Class78_Sub1_Sub1 arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass78_Sub1_Sub1_6 = arg0;
		this.aBoolean534 = arg2;
		this.aClass172_17 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5602() {
		if (this.aBoolean533 && ae.a((byte) -114, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean533 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)I")
	@Override
	public int method5598() {
		return this.anInt6936;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5603() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(11) boolean local11 = this.aBoolean534 & true;
		if (!this.aBoolean533 && ae.a((byte) 118, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt6935, local11 ? 8192 : 0, this.aClass78_Sub1_Sub1_6.aGeometryBuffer1))) {
			this.aBoolean533 = true;
			return this.aClass78_Sub1_Sub1_6.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
	@Override
	public void method5600(@OriginalArg(0) int arg0) {
		this.anInt6936 = arg0 * this.aClass172_17.anInt4482;
		if (this.anInt6935 >= this.anInt6936) {
			return;
		}
		@Pc(25) short local25 = 8;
		@Pc(30) byte local30;
		if (this.aBoolean534) {
			local30 = 0;
			local25 = 520;
		} else {
			local30 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(125);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass78_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt6936, local25, this.aClass172_17 == Static243.aClass172_10 ? 101 : 102, local30, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt6935 = this.anInt6936;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Lclient!jg;")
	@Override
	public Class172 method5599() {
		return this.aClass172_17;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	@Override
	public void method5601() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(111);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt6935 = 0;
		this.anInt6936 = 0;
	}
}
