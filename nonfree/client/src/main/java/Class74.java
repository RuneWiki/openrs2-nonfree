import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.pda;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class74 implements Interface15 {

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "I")
	private int anInt1979;

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "B")
	private byte aByte38;

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
	private int anInt1980;

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "Z")
	private boolean aBoolean156 = false;

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "Z")
	private final boolean aBoolean155;

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "Lclient!uda;")
	private final Class95_Sub1_Sub2 aClass95_Sub1_Sub2_4;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!uda;Z)V")
	public Class74(@OriginalArg(0) Class95_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean155 = arg1;
		this.aClass95_Sub1_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(I)V")
	@Override
	public void method7409() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(true);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt1979 = 0;
		this.anInt1980 = 0;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method5527(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2) {
		return this.method5530(arg2, arg0) ? this.anIDirect3DVertexBuffer1.a(arg1, 0, 0, this.anInt1980, this.aBoolean155 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)I")
	public int method1657() {
		return this.aByte38;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5529() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(16) boolean local16 = this.aBoolean155 & true;
		if (!this.aBoolean156 && pda.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt1979, local16 ? 8192 : 0, this.aClass95_Sub1_Sub2_4.aGeometryBuffer1), 17527)) {
			this.aBoolean156 = true;
			return this.aClass95_Sub1_Sub2_4.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5528() {
		if (this.aBoolean156 && pda.a(this.anIDirect3DVertexBuffer1.Unlock(), 17527)) {
			this.aBoolean156 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)I")
	@Override
	public int method7404() {
		return this.anInt1980;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method5530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1980 = arg0;
		this.aByte38 = (byte) arg1;
		if (this.anInt1980 > this.anInt1979) {
			@Pc(18) short local18 = 8;
			@Pc(23) byte local23;
			if (this.aBoolean155) {
				local18 = 520;
				local23 = 0;
			} else {
				local23 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(true);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass95_Sub1_Sub2_4.anIDirect3DDevice1.a(this.anInt1980, local18, 0, local23, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt1979 = this.anInt1980;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}
}
