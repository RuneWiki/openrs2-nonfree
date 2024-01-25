import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.wd;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class267 implements Interface10 {

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
	private int anInt6739;

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
	private int anInt6740;

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "Z")
	private boolean aBoolean501 = false;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "Z")
	private final boolean aBoolean502;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "Lclient!rd;")
	private final Class95_Sub3_Sub1 aClass95_Sub3_Sub1_5;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "Lclient!kf;")
	private final Class189 aClass189_18;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!rd;Lclient!kf;Z)V")
	public Class267(@OriginalArg(0) Class95_Sub3_Sub1 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean502 = arg2;
		this.aClass95_Sub3_Sub1_5 = arg0;
		this.aClass189_18 = arg1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
	@Override
	public void method7459() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -99);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt6739 = 0;
		this.anInt6740 = 0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7385() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(10) boolean local10 = this.aBoolean502 & true;
		if (!this.aBoolean501 && wd.a(51, (int) this.anIDirect3DIndexBuffer1.Lock(0, this.anInt6740, local10 ? 8192 : 0, this.aClass95_Sub3_Sub1_5.aGeometryBuffer1))) {
			this.aBoolean501 = true;
			return this.aClass95_Sub3_Sub1_5.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7384() {
		if (this.aBoolean501 && wd.a(125, (int) this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean501 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)Lclient!kf;")
	@Override
	public Class189 method7386() {
		return this.aClass189_18;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(Z)I")
	@Override
	public int method7455() {
		return this.anInt6739;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7382(@OriginalArg(0) int arg0) {
		this.anInt6739 = arg0 * this.aClass189_18.anInt4729;
		if (this.anInt6739 <= this.anInt6740) {
			return;
		}
		@Pc(20) short local20 = 8;
		@Pc(25) byte local25;
		if (this.aBoolean502) {
			local20 = 520;
			local25 = 0;
		} else {
			local25 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -128);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass95_Sub3_Sub1_5.anIDirect3DDevice1.a(this.anInt6739, local20, this.aClass189_18 == Static290.aClass189_12 ? 101 : 102, local25, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt6740 = this.anInt6739;
	}
}
