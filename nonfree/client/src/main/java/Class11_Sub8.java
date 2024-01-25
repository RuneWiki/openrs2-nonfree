import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class11_Sub8 extends Class11 {

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "Z")
	private boolean aBoolean608;

	@OriginalMember(owner = "client!sh", name = "z", descriptor = "Z")
	private boolean aBoolean610;

	@OriginalMember(owner = "client!sh", name = "A", descriptor = "Z")
	private boolean aBoolean611 = false;

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "Z")
	private final boolean aBoolean609;

	@OriginalMember(owner = "client!sh", name = "u", descriptor = "Lclient!qi;")
	private Class273 aClass273_5;

	@OriginalMember(owner = "client!sh", name = "s", descriptor = "Lclient!qi;")
	private Class273 aClass273_3;

	@OriginalMember(owner = "client!sh", name = "t", descriptor = "Lclient!qi;")
	private Class273 aClass273_4;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "Lclient!qi;")
	private Class273 aClass273_2;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "Lclient!aw;")
	private Class3_Sub2 aClass3_Sub2_5;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!wh;)V")
	public Class11_Sub8(@OriginalArg(0) Class100_Sub3 arg0) {
		super(arg0);
		if (super.aClass100_Sub3_41.aBoolean719) {
			this.aClass273_5 = Static501.method7467("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass100_Sub3_41);
			this.aClass273_3 = Static501.method7467("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass100_Sub3_41);
			this.aClass273_4 = Static501.method7467("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass100_Sub3_41);
			this.aClass273_2 = Static501.method7467("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass100_Sub3_41);
			if (this.aClass273_3 != null & this.aClass273_5 != null & this.aClass273_4 != null & this.aClass273_2 != null) {
				this.aClass3_Sub2_5 = new Class3_Sub2(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass3_Sub2_5.method3904(false, false);
				this.aBoolean609 = true;
			} else {
				this.aBoolean609 = false;
			}
		} else {
			this.aBoolean609 = false;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!me;ZI)V")
	@Override
	public void method8726(@OriginalArg(0) Class3 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean611) {
				super.aClass100_Sub3_41.method8889(5890, 0, 768);
				super.aClass100_Sub3_41.method8923(5890, 0);
				this.aBoolean611 = false;
			}
			super.aClass100_Sub3_41.method8925(arg0);
			super.aClass100_Sub3_41.method8903(arg1);
		} else if (!this.aBoolean611) {
			super.aClass100_Sub3_41.method8925(super.aClass100_Sub3_41.aClass3_Sub2_6);
			super.aClass100_Sub3_41.method8903(1);
			super.aClass100_Sub3_41.method8889(34168, 0, 768);
			super.aClass100_Sub3_41.method8923(34168, 0);
			this.aBoolean611 = true;
		}
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V")
	public void method7752() {
		@Pc(7) Class154_Sub3 local7 = super.aClass100_Sub3_41.aClass154_Sub3_4;
		if (this.aBoolean610) {
			OpenGL.glBindProgramARB(34336, ~super.aClass100_Sub3_41.anInt10626 == Integer.MIN_VALUE ? this.aClass273_3.anInt8193 : this.aClass273_2.anInt8193);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass100_Sub3_41.anInt10626 == Integer.MIN_VALUE ? this.aClass273_5.anInt8193 : this.aClass273_4.anInt8193);
		}
		local7.method6576((float) super.aClass100_Sub3_41.anInt10626, -1.0F, 0.0F, Static391.aFloatArray65, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static391.aFloatArray65[0], Static391.aFloatArray65[1], Static391.aFloatArray65[2], Static391.aFloatArray65[3]);
		OpenGL.glEnable(34336);
		this.aBoolean608 = true;
		this.method7755();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8725() {
		return this.aBoolean609;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
	@Override
	public void method8723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8724(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8728(@OriginalArg(1) boolean arg0) {
		this.aBoolean610 = arg0;
		super.aClass100_Sub3_41.method8861(1);
		super.aClass100_Sub3_41.method8925(this.aClass3_Sub2_5);
		super.aClass100_Sub3_41.method8880(7681, 34165);
		super.aClass100_Sub3_41.method8889(34166, 0, 768);
		super.aClass100_Sub3_41.method8889(5890, 2, 770);
		super.aClass100_Sub3_41.method8923(34168, 0);
		super.aClass100_Sub3_41.method8861(0);
		this.method7752();
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
	@Override
	public void method8727() {
		if (this.aBoolean608) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean608 = false;
		}
		super.aClass100_Sub3_41.method8861(1);
		super.aClass100_Sub3_41.method8925((Class3) null);
		super.aClass100_Sub3_41.method8880(8448, 8448);
		super.aClass100_Sub3_41.method8889(5890, 0, 768);
		super.aClass100_Sub3_41.method8889(34166, 2, 770);
		super.aClass100_Sub3_41.method8923(5890, 0);
		super.aClass100_Sub3_41.method8861(0);
		if (this.aBoolean611) {
			super.aClass100_Sub3_41.method8889(5890, 0, 768);
			super.aClass100_Sub3_41.method8923(5890, 0);
			this.aBoolean611 = false;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
	public void method7755() {
		if (!this.aBoolean608) {
			return;
		}
		@Pc(6) int local6 = super.aClass100_Sub3_41.XA();
		@Pc(10) int local10 = super.aClass100_Sub3_41.i();
		@Pc(20) float local20 = (float) local6 - (float) (local6 - local10) * 0.125F;
		@Pc(32) float local32 = -((float) (local6 - local10) * 0.25F) + (float) local6;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local32, local20, 1.0F / (float) super.aClass100_Sub3_41.anInt10619, (float) super.aClass100_Sub3_41.anInt10611 / 255.0F);
		super.aClass100_Sub3_41.method8861(1);
		super.aClass100_Sub3_41.method8891(super.aClass100_Sub3_41.anInt10602);
		super.aClass100_Sub3_41.method8861(0);
	}
}
