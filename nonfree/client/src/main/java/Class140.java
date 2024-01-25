import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.fe;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class140 implements Interface16 {

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "B")
	private byte aByte41;

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!iba", name = "e", descriptor = "I")
	private int anInt3858;

	@OriginalMember(owner = "client!iba", name = "f", descriptor = "I")
	private int anInt3859;

	@OriginalMember(owner = "client!iba", name = "g", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "Lclient!de;")
	private final Class62_Sub1_Sub1 aClass62_Sub1_Sub1_1;

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "Z")
	private final boolean aBoolean229;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!de;Z)V")
	public Class140(@OriginalArg(0) Class62_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass62_Sub1_Sub1_1 = arg0;
		this.aBoolean229 = arg1;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIB)Z")
	@Override
	public boolean method3464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte41 = (byte) arg0;
		this.anInt3858 = arg1;
		if (this.anInt3859 < this.anInt3858) {
			@Pc(24) short local24 = 8;
			@Pc(29) byte local29;
			if (this.aBoolean229) {
				local29 = 0;
				local24 = 520;
			} else {
				local29 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(70);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass62_Sub1_Sub1_1.anIDirect3DDevice1.a(this.anInt3858, local24, 0, local29, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt3859 = this.anInt3858;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method3463(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method3464(arg2, arg1) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt3858, this.aBoolean229 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)I")
	@Override
	public int method3485() {
		return this.anInt3858;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)I")
	public int method3334() {
		return this.aByte41;
	}

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method3492() {
		if (this.aBoolean230 && fe.a((byte) -44, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean230 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method3487() {
		@Pc(10) boolean local10 = this.aBoolean229 & true;
		if (!this.aBoolean230 && fe.a((byte) -124, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt3859, local10 ? 8192 : 0, this.aClass62_Sub1_Sub1_1.aGeometryBuffer1))) {
			this.aBoolean230 = true;
			return this.aClass62_Sub1_Sub1_1.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)V")
	@Override
	public void method3493() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(89);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt3858 = 0;
		this.anInt3859 = 0;
	}
}
